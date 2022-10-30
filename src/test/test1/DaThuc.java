package test.test1;

import java.util.Scanner;

public class DaThuc {
    private int soMu;
    private float[] heSo;

    public DaThuc() {
    }

    public DaThuc(int soMu, float[] heSo) {
        this.soMu = soMu;
        this.heSo = new float[soMu+1];
        for (int i = 0; i <= soMu; i++)
            this.heSo[i] = heSo[i];
    }

    public int getSoMu() {
        return soMu;
    }

    public void setSoMu(int soMu) {
        this.soMu = soMu;
    }

    public float[] getHeSo() {
        return heSo;
    }

    public void setHeSo(float[] heSo) {
        this.heSo = heSo;
    }

    public void input() {
        System.out.print("Nhap so mu cua da thuc: ");
        Scanner sc = new Scanner(System.in);
        this.soMu = sc.nextInt();
        heSo =  new float[soMu+1];
        for (int i = soMu; i >= 0; i--) {
            System.out.print("Nhap he so cua x^" + i + ": ");
            heSo[i] = sc.nextFloat();
        }
    }

    public String output(float heso[]) {
        int soMu = 0;
        for (float f : heso)
            if (f != 0) soMu++;
        if(soMu == 0) return "0";
        String[] ans = new String[soMu];
        int index = 0;

        for (int i = heso.length - 1; i >= 0; i--) {
            if (heso[i] != 0) {
                ans[index] = heso[i] + "x^" + i;
                index++;
            }
        }
        return String.join(" + ", ans);
    }



    public void tinhGiaTri() {
        double res = 0;
        for (int i = 0; i <= soMu; i++) {
            res += heSo[i] * Math.pow(2, i);
        }
        System.out.println("Gia tri bieu thuc tai x = 2 la: " + res);
    }

    public void chiaLayDu(DaThuc b) {
        float[] cpy = new float[soMu + 1];
        for (int i = 0; i <= soMu; i++)
            cpy[i] = heSo[i];

        int index = 0;
        float[] res = new float[soMu + 1];
        for (int i = soMu; i >= b.soMu; i--) {
            int con = b.soMu - index;
            if (cpy[i] == 0 || b.heSo[con] == 0) continue;
            float heso = cpy[i]/b.heSo[con];
            res[i-b.soMu] = heso;
            for (int j = 0; j <= b.soMu; j++)
                cpy[i-j] -= b.heSo[b.soMu-j]*heso;
            index++;
        }

        System.out.print("Da thuc du cua 2 da thuc la: ");
        System.out.println(output(cpy));
    }
}
