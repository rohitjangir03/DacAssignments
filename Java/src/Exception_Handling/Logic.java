package Exception_Handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logic {
    public static final int maxMoney;
    public static final int minMoney;
    static SimpleDateFormat sdt;
    static{
        maxMoney=1000000;
        minMoney=300000;
        sdt = new SimpleDateFormat("dd/mm/yyyy");
    }
    public static void validateMoney(int money) throws exception {
      if(money<minMoney)
      throw new exception("Need no action comes under BPL");
      if(money>maxMoney)
      throw new exception("needs action: search warrant issued");

      System.out.println("No action needed will pay income tax");
    }
    public static void validateDate(String str) throws ParseException, exception {
        Date d = sdt.parse(str);
        Date curDate=new Date();
        if(d.after(curDate))
           throw new exception("Income tax not paid Kindly pay asap");

        System.out.println("Income Tax Paid Succesfully");
    }
}
