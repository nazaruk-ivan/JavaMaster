package Examples.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Target(ElementType.TYPE)
//@Inherited
//@Documented
@Retention(RetentionPolicy.SOURCE)
public @interface Custom {
    String name() default "Ivan";
    int count() default 120;
    String[] tags() default {"java", "py"};
}
