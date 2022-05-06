package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object G_SiteURL
     
    /**
     * <p></p>
     */
    public static Object G_Email_To
     
    /**
     * <p></p>
     */
    public static Object G_Email_Username
     
    /**
     * <p></p>
     */
    public static Object G_Email_Password
     
    /**
     * <p></p>
     */
    public static Object G_Email_Subject
     
    /**
     * <p></p>
     */
    public static Object G_Confirm_Url_Search_Expert
     
    /**
     * <p></p>
     */
    public static Object G_Confirm_Url_Part
     
    /**
     * <p></p>
     */
    public static Object G_Host_Imap
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            G_SiteURL = selectedVariables['G_SiteURL']
            G_Email_To = selectedVariables['G_Email_To']
            G_Email_Username = selectedVariables['G_Email_Username']
            G_Email_Password = selectedVariables['G_Email_Password']
            G_Email_Subject = selectedVariables['G_Email_Subject']
            G_Confirm_Url_Search_Expert = selectedVariables['G_Confirm_Url_Search_Expert']
            G_Confirm_Url_Part = selectedVariables['G_Confirm_Url_Part']
            G_Host_Imap = selectedVariables['G_Host_Imap']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
