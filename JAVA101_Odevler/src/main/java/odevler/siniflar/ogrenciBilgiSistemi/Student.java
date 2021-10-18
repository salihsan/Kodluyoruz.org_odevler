package odevler.siniflar.ogrenciBilgiSistemi;

public class Student {
    String name,stuNo;
    int classes;
    Course matSozluNote;
    Course fizikSozluNote;
    Course kimyaSozluNote;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name,
            int classes,
            String stuNo,
            Course mat,
            Course fizik,
            Course kimya,
            Course matSozluNote,
            Course fizikSozluNote,
            Course kimyaSozluNote
            ) {
        this.name = name;
        this.classes = classes;
        this.matSozluNote=matSozluNote;
        this.fizikSozluNote=fizikSozluNote;
        this.kimyaSozluNote=kimyaSozluNote;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(
            int mat,
            int fizik,
            int kimya,
            int matSozluNote,
            int fizikSozluNote,
            int kimyaSozluNote) {

        if (mat >= 0 && mat <= 100 && matSozluNote>=0 && matSozluNote<=100) {
            this.mat.note = mat;
            this.mat.sNote=matSozluNote;
        }

        if (fizik >= 0 && fizik <= 100 && fizikSozluNote>=0 && fizikSozluNote<=100 ) {
            this.fizik.note = fizik;
            this.fizik.sNote=fizikSozluNote;
        }

        if (kimya >= 0 && kimya <= 100 && kimyaSozluNote>=0 && kimyaSozluNote<=100) {
            this.kimya.note = kimya;
            this.kimya.sNote=kimyaSozluNote;
        }


    }

    public void isPass() {
        if ((this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0)
                &&
                (this.mat.sNote == 0 || this.fizik.sNote == 0 || this.kimya.sNote == 0)
        ) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (
                (this.fizik.note*0.80+ this.fizik.sNote*0.20) +
                (this.kimya.note*0.80+ this.kimya.sNote*0.20) +
                (this.mat.note*0.80+ this.mat.sNote*0.20)
                ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + (this.mat.note*0.80+ this.mat.sNote*0.20) );
        System.out.println("Fizik Notu : " + (this.fizik.note*0.80+ this.fizik.sNote*0.20) );
        System.out.println("Kimya Notu : " + (this.kimya.note*0.80+ this.kimya.sNote*0.20) );
    }
}
