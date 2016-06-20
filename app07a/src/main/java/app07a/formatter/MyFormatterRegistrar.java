package app07a.formatter;

import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;

/**
 * Created by jecyhw on 2016/6/13.
 */
public class MyFormatterRegistrar implements FormatterRegistrar {
    private String datePattern;

    public MyFormatterRegistrar(String datePattern) {
        this.datePattern = datePattern;
    }

    public void registerFormatters(FormatterRegistry formatterRegistry) {
        formatterRegistry.addFormatter(new DateFormatter(datePattern));
        //register more formatters here
    }
}
