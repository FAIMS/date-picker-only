package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Tabgroup
     */
    public static View get_Tabgroup(Solo solo) {
        String ref = "Tabgroup";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Tabgroup/Tab
     */
    public static View get_Tabgroup_Tab(Solo solo) {
        String ref = "Tabgroup/Tab";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: input
        Ref:  Tabgroup/Tab/Date_Picker
     */
    public static EditText get_Tabgroup_Tab_DatePicker(Solo solo) {
        String ref = "Tabgroup/Tab/Date_Picker";
        return (android.widget.EditText) solo.getView((Object) ref);
    }
}
