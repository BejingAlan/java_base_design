package wangjm.java.base.collection;

import java.util.Date;

public class CloneableTest {
}
class ShallowCopy implements Cloneable {
    private Date begin;

    public Date getBegin() {
        return this.begin;
    }

    public void setBegin(Date d) {
        this.begin = d;
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return obj;
    }

    public static void main(String[] args) {
        Date date = new Date(10000L);
        ShallowCopy copy = new ShallowCopy();
        copy.setBegin(date);
        ShallowCopy copy2 = (ShallowCopy) copy.clone();
        System.out.println(copy.getBegin() + "\n"
                + copy2.getBegin() + "\n" +
                (copy == copy2));
        date.setTime(100000000L);
        ;
        System.out.println(copy.getBegin() + "\n"
                + copy2.getBegin() + "\n" +
                (copy == copy2));
    }
}

class DeepCopy implements Cloneable {
    private Date begin;

    public Date getBegin() {
        return this.begin;
    }

    public void setBegin(Date d) {
        this.begin = d;
    }

    public Object clone() {
        DeepCopy obj = null;
        try {
            obj = (DeepCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        obj.setBegin((Date) this.getBegin().clone());
        return obj;
    }

    public static void main(String[] args) {
        Date date = new Date(10000L);
        DeepCopy copy = new DeepCopy();
        copy.setBegin(date);
        DeepCopy copy2 = (DeepCopy) copy.clone();
        System.out.println(copy.getBegin() + "\n"
                + copy2.getBegin() + "\n" +
                (copy == copy2));
        date.setTime(100000000L);
        System.out.println(copy.getBegin() + "\n"
                + copy2.getBegin() + "\n" +
                (copy == copy2));
    }
}