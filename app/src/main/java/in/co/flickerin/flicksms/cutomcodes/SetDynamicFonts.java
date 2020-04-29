package in.co.flickerin.flicksms.cutomcodes;

public class SetDynamicFonts {

    public String getTitle(String bold_or_semibold_or_regular) {

        if(bold_or_semibold_or_regular.toLowerCase().equals("bold")){
            return "fonts/niconneregularstyle.ttf";
        }else if(bold_or_semibold_or_regular.toLowerCase().equals("semibold")){
            return "fonts/poppinsregular.ttf";
        }else{
            return "fonts/poppinsregular.ttf";
        }

    }


}
