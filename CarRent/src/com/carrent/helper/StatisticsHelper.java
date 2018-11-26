/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrent.helper;

import com.carrent.dto.StatisticsDTO;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aissam
 */
public class StatisticsHelper {

    static class VariationGlyph {

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

        int weeklyRentals = 129;
        newStatistics.setWeeklyRentals(String.valueOf(weeklyRentals));

        int weeklyVisits = 295;
        newStatistics.setWeeklyVisits(String.valueOf(weeklyVisits));

        int weeklyConverstionRate = (int) (100 * (weeklyRentals / weeklyVisits));
        newStatistics.setWeeklyConversionRate(String.valueOf(weeklyConverstionRate) + "%");

        newStatistics.setWeeklyBilledDays(String.valueOf(452));

        double weeklyBilledDaysVariation = -5;
        newStatistics.setWeeklyBilledDaysVariation(String.valueOf(Math.abs(weeklyBilledDaysVariation)+"%"));
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
        double totalIncomeVariation = 1.3;
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
}
