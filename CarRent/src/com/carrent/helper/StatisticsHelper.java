/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.helper;

import com.carrent.dto.RentalsDTO;
import com.carrent.dto.StatisticsDTO;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Aissam
 */
public class StatisticsHelper {

    private static class VariationGlyph {

        private String glyphName = "";
        private String glyphStyleClass = "";

        public VariationGlyph() {
        }

    }

    public static StatisticsDTO prepareStatistics() {

        StatisticsDTO newStatistics = new StatisticsDTO();

        newStatistics.setWeeklyAccounts(String.valueOf(105));

        newStatistics.setStartDate(LocalDate.of(2018, Month.NOVEMBER, 19).toString());
        newStatistics.setEndDate(LocalDate.of(2018, Month.NOVEMBER, 25).toString());

        double weeklyRentals = 129;
        newStatistics.setWeeklyRentals(String.valueOf(weeklyRentals));

        double weeklyVisits = 295;
        newStatistics.setWeeklyVisits(String.valueOf(weeklyVisits));

        int weeklyConverstionRate = (int) (100 * (weeklyRentals / weeklyVisits));
        newStatistics.setWeeklyConversionRate(String.valueOf(weeklyConverstionRate) + "%");

        newStatistics.setWeeklyBilledDays(String.valueOf(452));

        double weeklyBilledDaysVariation = -5;
        newStatistics.setWeeklyBilledDaysVariation(String.valueOf(Math.abs(weeklyBilledDaysVariation) + "%"));

        VariationGlyph weeklyBilledDaysGlyph;
        weeklyBilledDaysGlyph = setVariationGlyph(weeklyBilledDaysVariation);
        newStatistics.setWeeklyBilledDaysGlyphName(weeklyBilledDaysGlyph.glyphName);
        newStatistics.setWeeklyBilledDaysGlyphStyle(weeklyBilledDaysGlyph.glyphStyleClass);

        newStatistics.setMonthlyIncome("$26,584");
        double monthlyIncomeVariation = 3;
        newStatistics.setMonthlyIncomeVariation(String.valueOf(Math.abs(monthlyIncomeVariation)) + "%");
        VariationGlyph monthlyIncomeGlyph;
        monthlyIncomeGlyph = setVariationGlyph(monthlyIncomeVariation);
        newStatistics.setMonthlyIncomeGlyphName(monthlyIncomeGlyph.glyphName);
        newStatistics.setMonthlyIncomeGlyphStyle(monthlyIncomeGlyph.glyphStyleClass);

        newStatistics.setTotalIncome("$125,356");
        double totalIncomeVariation = -1.3;
        newStatistics.setTotalIncomeVariation(String.valueOf(Math.abs(totalIncomeVariation)) + "%");

        VariationGlyph totalIncomeGlyph;
        totalIncomeGlyph = setVariationGlyph(totalIncomeVariation);
        newStatistics.setTotalIncomeGlyphName(totalIncomeGlyph.glyphName);
        newStatistics.setTotalIncomeGlyphStyle(totalIncomeGlyph.glyphStyleClass);

        return newStatistics;

    }

    private static VariationGlyph setVariationGlyph(double variation) {

        VariationGlyph variationG;
        variationG = new VariationGlyph();

        if (variation >= 0) {
            variationG.glyphName = "CARET_UP";
            variationG.glyphStyleClass = "variation-up";
        } else {
            variationG.glyphName = "CARET_DOWN";
            variationG.glyphStyleClass = "variation-down";
        }
        return variationG;
    }

    public static ObservableList<RentalsDTO> prepareRecentRentsList() {
        ObservableList<RentalsDTO> recentRents = FXCollections.observableArrayList();
        recentRents.add(new RentalsDTO("45895", "Amber", 10, "$300", LocalDate.of(2018, Month.NOVEMBER, 9)));
        recentRents.add(new RentalsDTO("45895", "Steve", 3, "$90", LocalDate.of(2018, Month.OCTOBER, 31)));
        recentRents.add(new RentalsDTO("45895", "Carl", 2, "$150", LocalDate.of(2018, Month.OCTOBER, 31)));
        recentRents.add(new RentalsDTO("45895", "Sarah", 1, "$40", LocalDate.of(2018, Month.OCTOBER, 31)));
        recentRents.add(new RentalsDTO("45895", "Rojer", 5, "$250", LocalDate.of(2018, Month.OCTOBER, 30)));
        return recentRents;

    }

    public static Map<String, Integer> prepareRentsOfTheWeek() {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Mon", 4);
        map.put("Tue", 10);
        map.put("Wed", 15);
        map.put("Thu", 8);
        map.put("Fri", 5);
        map.put("Sat", 18);
        map.put("Sun", 15);

        return map;

    }
}
