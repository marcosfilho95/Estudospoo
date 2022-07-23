import java.util.Scanner;

public class Material {
    float DiametroCirculo7;
    float RaioCirculo7;
    float RaioCirculo1;
    float RaioCirculo6;
    float RaioCirculo5;
    float RaioCirculo4;
    float RaioCirculo3;
    float RaioCirculo2;
    float AreaCirculo1;
    float AreaCirculo2;
    float AreaCirculo3;
    float AreaCirculo4;
    float AreaCirculo5;
    float AreaCirculo6;
    float AreaCirculo7;

    public Material() {
    }

    public void CalcArea (){
        Scanner prompt = new Scanner(System.in);
        float DiametroCalc = DiametroCirculo7;
        System.out.println("Digite o diametro do Circulo 7: ");
        DiametroCalc = prompt.nextFloat();
        RaioCirculo7 = DiametroCalc/2;
            RaioCirculo1 = RaioCirculo7/7;
            RaioCirculo6 = RaioCirculo1*6;
            RaioCirculo5 = RaioCirculo1*5;
            RaioCirculo4 = RaioCirculo1*4;
            RaioCirculo3 = RaioCirculo1*3;
            RaioCirculo2 = RaioCirculo1*2;
            AreaCirculo1 = (float) (3.14*RaioCirculo1*RaioCirculo1);
            AreaCirculo2 = (float) (3.14*RaioCirculo2*RaioCirculo2);
            AreaCirculo3 = (float) (3.14*RaioCirculo3*RaioCirculo3);
            AreaCirculo4 = (float) (3.14*RaioCirculo4*RaioCirculo4);
            AreaCirculo5 = (float) (3.14*RaioCirculo5*RaioCirculo5);
            AreaCirculo6 = (float) (3.14*RaioCirculo6*RaioCirculo6);
            AreaCirculo7 = (float) (3.14*RaioCirculo7*RaioCirculo7);
            float AreaTotal = AreaCirculo1+AreaCirculo2+AreaCirculo3+AreaCirculo4+AreaCirculo5+AreaCirculo6+AreaCirculo7;
            float QtdPapelao = AreaTotal*5000;
        System.out.println("A quantidade total de Papelao usado foi de: "+QtdPapelao+" cm.");
    }

    @Override
    public String toString() {
        return "Material{" +
                "DiametroCirculo7=" + DiametroCirculo7 +
                ", RaioCirculo7=" + RaioCirculo7 +
                ", RaioCirculo1=" + RaioCirculo1 +
                ", RaioCirculo6=" + RaioCirculo6 +
                ", RaioCirculo5=" + RaioCirculo5 +
                ", RaioCirculo4=" + RaioCirculo4 +
                ", RaioCirculo3=" + RaioCirculo3 +
                ", RaioCirculo2=" + RaioCirculo2 +
                ", AreaCirculo1=" + AreaCirculo1 +
                ", AreaCirculo2=" + AreaCirculo2 +
                ", AreaCirculo3=" + AreaCirculo3 +
                ", AreaCirculo4=" + AreaCirculo4 +
                ", AreaCirculo5=" + AreaCirculo5 +
                ", AreaCirculo6=" + AreaCirculo6 +
                ", AreaCirculo7=" + AreaCirculo7 +
                '}';
    }
}
