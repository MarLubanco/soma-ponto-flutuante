import java.util.Arrays;

public class Service {

    public void calcularSomatorio(PontoF ponto1, PontoF ponto2) {
        if(ponto1.getExpoente() == ponto2.getExpoente()) {
            System.out.println("Expoentes iguais");
        } else if( ponto1.getExpoente() > ponto2.getExpoente()) {
            int diferenca = ponto1.getExpoente() - ponto2.getExpoente();
            System.out.println(diferenca);
        } else if(ponto1.getExpoente() < ponto2.getExpoente()) {
            int diferenca = ponto2.getExpoente() - ponto1.getExpoente();
            String[] split = String.valueOf(ponto1.getMantissa()).split(".");
            split[1] = "0".repeat(diferenca) + split[1];
            ponto1.setMantissa(Float.valueOf(split[0] + "." + split[1]));
            ponto1.setExpoente(ponto1.getExpoente() + diferenca);
            System.out.println(ponto1.getMantissa());
        }
    }

    public String calcularExpoente(String n) {
        String[] split = n.split(",");
        long qtdZeroA = 0;
        long qtdZeroB = 0;
        if(Float.valueOf(n.replace(",",".")) < 1) {
                qtdZeroA = split[1].length();
                return split[1] + "-" + qtdZeroA;
        } else {
            if (n.contains("0")) {
                char[] chars = n.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == '0' ) {
                        qtdZeroA++;
                    }
                }
            }
            return split[0].substring(0, (int) (split[0].length()-(qtdZeroA -1)))+"U"+qtdZeroA;
        }
    }

    public void calcularSoma(String n, String x) {
        System.out.println("Calculando ...");
        final double s = 10000;
        String[] nSplit= null;
        String[] xSplit= null;
        if(n.contains("U")) {
            nSplit = n.split("U");
        } else {
            nSplit = n.split("-");
        }

        if(x.contains("U")) {
            xSplit = x.split("U");
        } else {
            xSplit = x.split("-");
        }

        int valorN = Integer.valueOf(nSplit[1]);
        int valorX = Integer.valueOf(xSplit[1]);
        valorX = valorX - (valorX * 2);
        double valorFinal = 0;
        for (; valorX <= valorN; valorX++) {
            valorFinal += Math.pow(10, valorX);
        }
        valorFinal = 10000 - valorFinal;
        System.out.println("Resultado: " + valorFinal);
    }
}
