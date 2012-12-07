package org.xsalefter.thucydides.archtype_example.requirements;

import net.thucydides.core.annotations.Feature;

public class Application {
    @Feature
    public class Search {
        public class SearchByKeyword {}
        public class SearchByMultipleKeywords {}
    }
}