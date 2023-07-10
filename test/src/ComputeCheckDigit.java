public class ComputeCheckDigit {
    public static void main(String args[]){
        int check = computeCheckDigit("39847");
        System.out.println(check);
    }

    public static int computeCheckDigit(String identificationNumber){
        int sommePaire = 0;
        int sommeImpaire = 0;
        int result = 0;
        for(int i=0;i<identificationNumber.length();i++){
            Integer value = Integer.valueOf("" + identificationNumber.charAt(i));
            if(i%2==0){
                sommePaire+= value;
            }else{
                sommeImpaire+= value;
            }

        }
        result = sommePaire*3+sommeImpaire;
        int dernierChiffre = result%10;
        return dernierChiffre==0?0:10-dernierChiffre;
    }
}
