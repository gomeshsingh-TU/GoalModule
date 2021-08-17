package steps.GoalsUpdatedSteps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import pageobjects.GoalsUpdatedPageObjects.GoalsPage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class GoalsUpdatedSteps {
    @Steps
    GoalsPage goalsPage;

    public void setFirstQuarterEditCutoffDate(Quarter quarter) {
        goalsPage.clickOnDateIcon("Edit Cutoff");
        performChangeDateOnModalDatePicker(quarter, false);
    }

    public void setDateOnStatusChangeCutoff(Quarter quarter) {
        goalsPage.clickOnDateIcon("Status Change Cutoff");
        performChangeDateOnModalDatePicker(quarter, false);
    }

    public void selectADateOnStartDateAndEndDateField(Quarter quarter,Boolean isStartQuarterDate) {
        goalsPage.clickOnDateIcon(isStartQuarterDate);
        performChangeDateOnModalDatePicker(quarter, isStartQuarterDate);
    }

    private void performChangeDateOnModalDatePicker(Quarter quarter, Boolean isStartQuarterDate) {
        String month = convertToDateFormat(getDateToCurrentQuarter(quarter,isStartQuarterDate),true);
        String date =  convertToDateFormat(getDateToCurrentQuarter(quarter,isStartQuarterDate),false);

        goalsPage.clickOnModalHeader();
        goalsPage.clickOnModalMonth(month);
        goalsPage.selectFromModalDate(date);
    }

    public void setQuarterNameAs(String quarterName) {
        goalsPage.setQuarterNameAs(quarterName);
    }

    public Calendar getDateToCurrentQuarter(Quarter quarter,Boolean isStartQuarterDate){
        Calendar cal = Calendar.getInstance();
        if(isStartQuarterDate){
            cal.set(Calendar.MONTH,quarter.startMonth);
            cal.set(Calendar.DAY_OF_MONTH,1);
        }else{
            cal.set(Calendar.MONTH,quarter.endMonth);
            cal.set(Calendar.DAY_OF_MONTH,cal.getActualMaximum(Calendar.DATE));
        }
        return cal;
    }

    private String convertToDateFormat(Calendar cal,Boolean isMonthValue) {
        SimpleDateFormat dtFormatModalMonth = new SimpleDateFormat("MMM");
        SimpleDateFormat dtFormatDate = new SimpleDateFormat("EEEEE, MMMMM d, yyyy");
        if(isMonthValue){
            return dtFormatModalMonth.format(cal.getTime());
        }
        return dtFormatDate.format(cal.getTime());
    }

    public void selectOnIsListedField(String yesOrNo) {
        goalsPage.selectOnIsListedField(yesOrNo);
    }

    public void clickCancelButton() {
        goalsPage.clickCancelButton();
    }

    public void inputDataInDescriptionField() {
        goalsPage.inputDataInDescriptionField();
    }

    public void verifyCycleNameIsNotAddedInThelist() throws InterruptedException {
        goalsPage.verifyCycleNameNotInTheDropDownList();
    }

    @Step("Verify Cycle Name present in The List")
    public void verifyCycleNamePresentInTheList() {
        goalsPage.verifyCycleNamePresentInDropDownList();
    }

    public enum Quarter
    {
        First_Quarter(0,2), Second_Quarter(3,5), Third_Quarter(6,8), Fourth_Quarter(9,11);
        public final int startMonth;
        public final int endMonth;

        Quarter(int startMonth,int endMonth) {
            this.startMonth = startMonth;
            this.endMonth = endMonth;
        }

        public static Quarter valueOfstartMonth(int startMonth) {
            for (Quarter e : values()) {
                if (e.startMonth == startMonth) {
                    return e;
                }
            }
            return null;
        }

        public static Quarter valueOfendMonth(int endMonth) {
            for (Quarter e : values()) {
                if (e.endMonth == endMonth) {
                    return e;
                }
            }
            return null;
        }
    }
}
