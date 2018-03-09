package com.e74Studio.mobileoptimizer.freeboostercleaner.widget.textcounter.formatters;


import com.e74Studio.mobileoptimizer.freeboostercleaner.widget.textcounter.Formatter;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by prem on 10/28/14.
 */
public class IntegerFormatter implements Formatter {

    @Override
    public String format(String prefix, String suffix, float value) {
        return prefix + NumberFormat.getNumberInstance(Locale.US).format(value) + suffix;
    }
}