package testFinal.until;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String ID_REGEX_CLASS  = "^[A,C]\\\\[0-1]\\\\d{4}\\\\[I,L]\\\\[0-1]\\\\d{1}$";
    private static final String ID_REGEX_PERSON  = "[0-1]\\d{3}$";
    private static final String NAME_REGEX = "^[A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*(?:[ ][A-ZÀÁẠẢÃÂẦẤẬẨẪĂẰẮẶẲẴÈÉẸẺẼÊỀẾỆỂỄÌÍỊỈĨÒÓỌỎÕÔỒỐỘỔỖƠỜỚỢỞỠÙÚỤỦŨƯỪỨỰỬỮỲÝỴỶỸĐ][a-zàáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ]*)*$";
    private static final String PHONE_REGEX = "^0\\d{9}$";
    private static final String EMAIL_REGEX = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$";

    public static boolean checkRegexIdClass(String id){
        Pattern pattern = Pattern.compile(ID_REGEX_CLASS);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();

    }
    public static boolean checkRegexIdPerson(String id){
        Pattern pattern = Pattern.compile(ID_REGEX_PERSON);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();

    }
    public static boolean checkRegexName(String name){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }

    public static boolean checkPhoneNumbers(String phoneNumbers){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(phoneNumbers);
        return matcher.matches();
    }
    public static boolean checkEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
