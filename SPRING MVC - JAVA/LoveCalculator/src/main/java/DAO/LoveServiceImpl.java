package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@PropertySource("classpath:formula.properties")
@Service
public class LoveServiceImpl implements LoveService{

    Logger logger = Logger.getLogger(LoveServiceImpl.class.getName()); // For printing things in log rather than using sout

    @Autowired
    private Environment env; // For fetching data from the .properties file

    public final String Formula = "FLAMES";

    @Override
    public String calculateLove(String username, String crushname) {

        int UserAndCrushCount = (username+crushname).toCharArray().length;
        int FormulaCount = Formula.toCharArray().length;

        int rem = UserAndCrushCount%FormulaCount;
        char result = Formula.charAt(rem);

        String answer = whatsBetweenUs(result);
        return answer;
    }

    @Override
    public String whatsBetweenUs(char result) {

        String s = null;

        switch(result){
            case 'F':
                s =  env.getProperty("F");
                break;
            case 'L':
                s = env.getProperty("L");
                break;
            case 'A':
                s = env.getProperty("A");
                break;
            case 'M':
                s = env.getProperty("M");
                break;
            case 'E':
                s = env.getProperty("E");
                break;
            case 'S':
                s = env.getProperty("S");
                break;
            default:
                logger.info(">>>Invalid character");
                s = "Invalid!";
        }
        return s;
    }
}
