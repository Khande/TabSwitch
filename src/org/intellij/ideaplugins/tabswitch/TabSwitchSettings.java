package org.intellij.ideaplugins.tabswitch;

import com.intellij.openapi.util.NamedJDOMExternalizable;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.WriteExternalException;
import com.intellij.openapi.util.DefaultJDOMExternalizer;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.components.ApplicationComponent;
import org.jetbrains.annotations.NonNls;
import org.jdom.Element;

public class TabSwitchSettings implements ApplicationComponent, NamedJDOMExternalizable {

    public boolean SHOW_RECENT_FILES;

    public TabSwitchSettings() {
        SHOW_RECENT_FILES = false;
    }

    public void disposeComponent() {
    }

    @NonNls
    public String getComponentName() {
        return "tabswitch.TabSwitchSettings";
    }

    @NonNls
    public String getExternalFileName() {
        return "tab_switch";
    }

    public static TabSwitchSettings getInstance() {
        final Application application = ApplicationManager.getApplication();
        return application.getComponent(TabSwitchSettings.class);
    }

    public void initComponent() {
    }

    public boolean isShowRecentFiles() {
        return SHOW_RECENT_FILES;
    }

    public void readExternal(Element element) throws InvalidDataException {
        DefaultJDOMExternalizer.readExternal(this, element);
    }

    public void writeExternal(Element element) throws WriteExternalException {
        DefaultJDOMExternalizer.writeExternal(this, element);
    }
}