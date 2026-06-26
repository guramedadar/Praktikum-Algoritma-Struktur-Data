package com.finalExam;

public class Tax 
{
    Vehicle dataVehicle;
    
    int code,
        nominal,
        fine,
        monthPay;

    public Tax() {}
    public Tax (Vehicle dataVehicle, int monthPay) 
    {
        this.dataVehicle    = dataVehicle;
        this.monthPay       = monthPay;
        this.nominal        = nominal();
        this.fine           = fine();
    }

    int nominal()
    {
        if (dataVehicle.type.equalsIgnoreCase("2 wheels"))
        {
            if (dataVehicle.cc < 100) 
                return 100000;
            else if (dataVehicle.cc > 250)
                return 500000;
            else
                return 250000;
        }
        else
        {
            if (dataVehicle.cc < 1000) 
                return 750000;
            else if (dataVehicle.cc > 2500)
                return 1500000;
            else
                return 1000000;
        }
    }

    int fine()
    {
        if (monthPay <= dataVehicle.dueMonth) 
            return 0;
        else
        {
            int fineMonth = monthPay - dataVehicle.dueMonth;
            
            if (fineMonth > 3)
                return 50000 * fineMonth;
            else
                return 50000;
        }
    }

    void print()
    {
        int totNominal = nominal + fine;

        System.out.printf
        (
            "%-6s | %-10s | %-12s | %-8s | %-5d | %-7d | %-7d | Rp%-9d | Rp%-7d | Rp%-9d\n",
            code, dataVehicle.tnkb, dataVehicle.name, dataVehicle.type, 
            dataVehicle.cc, dataVehicle.dueMonth, monthPay, nominal, fine, totNominal
        );
    }
}
