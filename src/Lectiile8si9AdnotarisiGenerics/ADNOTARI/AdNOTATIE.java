package Lectiile8si9AdnotarisiGenerics.ADNOTARI;

import java.lang.annotation.Documented;

@Documented
public @interface AdNOTATIE {
    String location();
    int courses() default 1;
    String category();

}
