package storage;

import java.io.IOException;

/**
 * A {@code BufferedFileManager} manages a storage space using the slotted page format and buffering.
 *
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class BufferedFileManager extends FileManager {

	// TODO complete this class (5 points)
  public static void main(String[] args) {
    System.out.println("vds");
    FileManager fm = new FileManager();

  }
	/**
	 * Constructs a {@code BufferedFileManager}.
	 *
	 * @param bufferSize
	 *            the number of {@code SlottedPage}s that the buffer can maintain
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	public BufferedFileManager(int bufferSize) throws IOException {
	}

}
