package com.example.android.sonar;

import java.io.Serializable;

public class Item implements Serializable {

    private String mM,mE;
    int mI=-1;

    public Item(String m,String e)
    {
        mM=m;
        mE=e;
    }
    public Item(String m,String e,int r)
    {
        mM=m;
        mE=e;
        mI=r;
    }
    public String getM(){return mM;
    }

    public String getE(){return mE;
    }
    public int getI(){return mI;
    }
    boolean hasImage()
    {
        if(mI==-1)
            return false;
        return true;
    }
}
