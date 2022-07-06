package test.ActivityLogs;

import BaseClasses.BaseTest;
import ImplementationClasses.SpotOnActivityLogsImpl;
import org.testng.annotations.Test;

public class ActivityLogsValidation extends BaseTest {
    @Test(description = "Verify Activity Logs")
    public void verifyActivityLogs()
    {

        add(new SpotOnActivityLogsImpl()).trigger();
    }
}