package 继承接口多态.继承.继承中方法的覆盖重写;

/**
 * 方法覆盖重写·的注意事项
 * 1 必须保证父子类之间的方法名称相同，参数列表也相同
 * @override 写在方法前面，用来检测是不是有效的正确不该重写
 *
 * 2 子类方法的返回值必须小于等于父类方法返回值的范围
 * Object 类是所有类的公共最高父类（祖宗类） java.lang.String 就是object子类
 *
 * 3 子类方法的全县必须大于等于父类方法的权限修饰符
 * 小扩展展示：public > protected> (default)>private
 *
 */
public class DemoOverride {
}
