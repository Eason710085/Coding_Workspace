package storage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import storage.SlottedPage.OverflowException;
/**
 * Student Name: Shunjie Wan
 * Assignment 1
 */

/**
 * A {@code FileManager} manages a storage space using the slotted page format.
 *
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class FileManager implements StorageManager<Long, Object> {

  /**
   * A map that associates the ID of each file with a {@code SlottedPageFile} for accessing that file.
   */
  Map<Integer, SlottedPageFile> id2file = new HashMap<Integer, SlottedPageFile>();

  /**
   * Returns the first location in any file.
   *
   * @return the first location in any file.
   */
  @Override
  public Long first() {
    return 0L;
  }

  /**
   * Shuts down this {@code FileManager} after saving all of the essential in-memory data on disk.
   *
   * @throws IOException if an I/O error occurs
   */
  public void shutdown() throws IOException {
    for (SlottedPageFile f : id2file.values())
      f.close(); // closes each data file
  }

  @Override
  public String toString() {
    return id2file.values().toString();
  }

  /**
   * Adds the specified object at the end of the specified file.
   *
   * @param fileID the ID of the file
   * @param o      the object to add
   * @return the location of the object in the specified file
   * @throws IOException if an I/O error occurs
   */
  @Override
  public Long add(int fileID, Object o) throws IOException {
    int size = size(fileID); // the number of pages in the data file
    SlottedPage p;
    long location;
    try {
      if (size == 0) { // if no page yet
        p = new SlottedPage(0); // create page 0
        location = concatenate(p.pageID(), p.add(o)); // add the object in the page
      } else { // existing page
        p = page(fileID, size - 1); // get last page
        try {
          location = concatenate(p.pageID(), p.add(o)); // add the object in the page
        } catch (OverflowException e) { // if the object cannot fit into the page
          p = new SlottedPage(p.pageID() + 1); // create a new page
          location = concatenate(p.pageID(), p.add(o)); // add the object in the new page
        }
      }
    } catch (OverflowException e) {
      throw new IOException(e);
    }
    updated(p, fileID); // inform that the page is updated (and thus the page will eventually be saved in the file)
    return location; // return the location of the object
  }

  /**
   * Puts the specified object at the specified location in the specified file.
   *
   * @param fileID   the ID of the file
   * @param location the location of the object
   * @param o        the object to put
   * @return the object stored previously at the specified location in the specified file; {@code null} if no such
   * object
   * @throws IOException              if an I/O error occurs
   * @throws InvalidLocationException if an invalid location is given
   */
  @Override
  public Object put(int fileID, Long location, Object o) throws IOException, InvalidLocationException {
//		SlottedPage p = page(fileID, first(location)); // the page specified by the 1st half of the location
    // TODO complete this method (5 points)
    // throw the InvalidLocationException if the page id is -1
    if (first(location) == -1) {
      throw new InvalidLocationException();
    }
    // get slotted page p
    SlottedPage p = page(fileID, first(location));
    if (p == null) {
      p = new SlottedPage(first(location));
    }
    try {
      //get the previously object at the specified location
      Object oldValue = p.put(second(location), o);
      //update the page
      updated(p, fileID);
      //return the previously object at the specified location
      return oldValue;
    } catch (OverflowException e) {
    } catch (SlottedPage.IndexOutOfBoundsException e) {
      throw new InvalidLocationException();
    }
    return null;
  }

  /**
   * Returns the object at the specified location in the specified file.
   *
   * @param fileID   the ID of the file
   * @param location the location of the object
   * @return the object at the specified location in the specified file
   * @throws IOException              if an I/O error occurs
   * @throws InvalidLocationException if an if an invalid location is given
   */
  @Override
  public Object get(int fileID, Long location) throws IOException, InvalidLocationException {
//		SlottedPage p = page(fileID, first(location)); // the page specified by the 1st half of the location
    // TODO complete this method (5 points)
    //throw InvalidLocationException if the page id is minus that 0
    if (first(location) < 0) {
      throw new InvalidLocationException();
    }
    SlottedPage p = page(fileID, first(location));

    if (p == null) {
      p = new SlottedPage(first(location));
    }

    try {
      //return the object at the specified location in the specified file
      return p.get(second(location));
    } catch (SlottedPage.IndexOutOfBoundsException e) {
      throw new InvalidLocationException();
    }
  }

  /**
   * Removes the specified object at the specified location in the specified file.
   *
   * @param fileID   the ID of the file
   * @param location the location of the object
   * @return the object stored previously at the specified location in the specified file; {@code null} if no such
   * object
   * @throws IOException              if an I/O error occurs
   * @throws InvalidLocationException if an if an invalid location is given
   */
  @Override
  public Object remove(int fileID, Long location) throws IOException, InvalidLocationException {
//		SlottedPage p = page(fileID, first(location)); // the page specified by the 1st half of the location
    // TODO complete this method (5 points)
    SlottedPage p = page(fileID, first(location));
    if (p == null) {
      throw new InvalidLocationException();
    }
    try {
      //get the previously object at the specified location
      Object oldValue = p.remove(second(location));
      //update the file
      updated(p, fileID);
      //return the previously object at the specified location
      return oldValue;
    } catch (SlottedPage.IndexOutOfBoundsException e) {
      throw new UnsupportedOperationException();
    }
  }

  /**
   * Removes all data from the specified file.
   *
   * @param fileID the ID of the file
   * @throws IOException if an I/O error occurs
   */
  @Override
  public void clear(int fileID) throws IOException {
    SlottedPageFile f = file(fileID);
    f.clear();
  }

  /**
   * Returns an iterator over all objects stored in the the specified file.
   *
   * @param fileID the ID of the file
   */
  @Override
  public Iterator<Object> iterator(int fileID) throws IOException {
    // TODO complete this method (5 points)
    SlottedPageFile File = file(fileID);
    Iterator<Object> iterator;
    iterator = page(fileID, 0).iterator();
    for (int i = 0; i < File.size(); i++) {
      while (iterator.hasNext()){
        iterator = page(fileID,i).iterator();
      }
    }
    return iterator;
  }

  /**
   * Returns the number of {@code SlottedPage}s in the specified {@code SlottedPageFile}.
   *
   * @param fileID the ID of the {@code SlottedPageFile}
   * @return the number of {@code SlottedPage}s in the specified {@code SlottedPageFile}
   * @throws IOException if an I/O error occurs
   */
  int size(int fileID) throws IOException {
    return file(fileID).size();
  }

  /**
   * Returns the specified {@code SlottedPage} ({@code null} if no such {@code SlottedPage}).
   *
   * @param fileID the ID of the file containing the {@code SlottedPage}
   * @param pageID the ID of the {@code SlottedPage}
   * @return the specified {@code SlottedPage}; {@code null} if no such {@code SlottedPage}
   * @throws IOException if an I/O error occurs
   */
  SlottedPage page(int fileID, int pageID) throws IOException {
    SlottedPageFile f = file(fileID);
    return f.get(pageID);
  }

  /**
   * Is invoked when the specified {@code SlottedPage} is updated.
   *
   * @param p      a {@code SlottedPage}
   * @param fileID the ID of the file containing the {@code SlottedPage}
   * @throws IOException if an I/O error occurs
   */
  void updated(SlottedPage p, int fileID) throws IOException {
    SlottedPageFile f = file(fileID);
    f.save(p);
  }

  /**
   * Returns a {@code long} value obtaining by concatenating the given {@code int} values
   *
   * @param i an {@code int} value
   * @param j an {@code int} value
   * @return a {@code long} value obtaining by concatenating the given {@code int} values
   */
  protected long concatenate(int i, int j) {
    return (((long) i) << 32) | j;
  }

  /**
   * Returns an {@code int} value obtained from the first 4 bytes of the given {@code long} value.
   *
   * @param l a {@code long} value.
   * @return an {@code int} value obtained from the first 4 bytes of the given {@code long} value
   */
  protected int first(long l) {
    return (int) (l >> 32);
  }

  /**
   * Returns an {@code int} value obtained from the last 4 bytes of the given {@code long} value.
   *
   * @param l a {@code long} value.
   * @return an {@code int} value obtained from the last 4 bytes of the given {@code long} value
   */
  protected int second(long l) {
    return (int) l;
  }

  /**
   * Returns the {@code SlottedPageFile} corresponding to the specified file ID.
   *
   * @param fileID the ID of a {@code SlottedPageFile}
   * @return the {@code SlottedPageFile} corresponding to the specified file ID
   * @throws IOException if an IO error occurs
   */
  protected SlottedPageFile file(int fileID) throws FileNotFoundException, IOException {
    SlottedPageFile file = id2file.get(fileID);
    if (file == null) {
      file = new SlottedPageFile(fileID + ".dat");
      id2file.put(fileID, file);
    }
    return file;
  }

}
