public class SizeOnDisk {

    public static void main(String args[]){
        System.out.println(computeSizeOnDisk(512, 1500));
    }

    public static int computeSizeOnDisk(int clusterSize, int fileSize){
        if(fileSize==0) return 0;

        int i=1;
        while(i*clusterSize<fileSize){
            i++;
        }
        return clusterSize*i;
    }
}
