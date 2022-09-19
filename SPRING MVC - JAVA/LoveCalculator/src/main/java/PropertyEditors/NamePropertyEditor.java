package PropertyEditors;

import java.beans.PropertyEditorSupport;
import java.util.Locale;

public class NamePropertyEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        String myConvertedStringValue = text.toUpperCase();
        setValue(myConvertedStringValue);

    }
}
