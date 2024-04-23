package org.example;


import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.BasicMDCAdapter;
import org.slf4j.helpers.Util;

public class Main {
    public static void main(String[] args) {
        Marker marker = MarkerFactory.getMarker("FIRST");
        Util.report("FIRST is ", marker.contains(MarkerFactory.getMarker("FIRST")));
    }
}