package compozitie;

import java.util.List;

public class Casa {
    public Living living;
    public List<Bucatarie> bucatarie;
    public List<Dormitor> dormitor;
    public List<Baie> baie;

    public Casa(Living living, List<Bucatarie> bucatarie, List<Dormitor> dormitor, List<Baie> baie) {
        this.living = living;
        this.bucatarie = bucatarie;
        this.dormitor = dormitor;
        this.baie = baie;
    }

    public void prezentareGeneralaCasa(){
        System.out.println("===Prezentare living===");
        living.prezentareLiving();
        System.out.println();

        System.out.println("===Prezentare bucatarii===");
        System.out.println("Casa mea are "+bucatarie.size()+"bucatarii.");
        for(int index=0; index<bucatarie.size(); index++){
            bucatarie.get(index).prezentareBucatarie();
        }
        System.out.println();

        System.out.println("===Prezentare dormitoare===");
        System.out.println("Casa mea are "+dormitor.size()+"dormitoare.");
        for(int index=0; index<dormitor.size(); index++){
            dormitor.get(index).prezentareDormitor();
        }
        System.out.println();

        System.out.println("===Prezentare bai===");
        System.out.println("Casa mea are "+baie.size()+"bai.");
        for(int index=0; index<baie.size(); index++){
            baie.get(index).prezentareBaie();
        }
    }


}
