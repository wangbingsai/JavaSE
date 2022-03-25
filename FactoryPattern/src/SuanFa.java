import java.util.Scanner;

public class SuanFa {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 4, 5, 6, 7, 8, 9, 4, 5, 6,
                4, 5, 3, 3, 3, 3, 4, 6, 7, 8, 9, 7,
                1, 2, 3, 3, 3, 3, 7, 8, 9, 4, 5, 6,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 1, 5,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6,
                1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = 0;
        int[][] da = new int[6][12];
        for (int b = 0; b < 6; b++) {
            for (int c = 0; c < 12; c++) {
                da[b][c] = a[d];

                d++;

            }

        }
        for (int k=0;k<6;k++){
            for (int l=0;l<12;l++){
                System.out.print(da[k][l]);
            }
            System.out.println();
        }
        System.out.println("----------------------------");


        for (int s = 1; s <= 12; s++) {
            if ( y - s >= 0) {
                if (da[x][y] == da[x][y - s]) {
                    da[x][y - s] = 0;
                    for (int cc=1;cc<12;cc++){
                        if (x-cc>=0){
                            if (da[x][y]==da[x-cc][y-s]){
                                da[x-cc][y-s]=0;
                            }else {
                                break;
                            }

                        }else {
                            break;
                        }
                    }

                } else {

                    break;

                }
            }else {

                break;
            }
        }
        //-----------------------------------
        for (int ss = 1; ss <= 12; ss++) {
            if ( y - ss >= 0) {
                if (da[x][y] == da[x][y - ss]) {
                    da[x][y - ss] = 0;
                    for (int dd=1;dd<12;dd++){
                        if (x+dd<12){
                            if (da[x][y]==da[x+dd][y-ss]){
                                da[x+dd][y-ss]=0;
                            }else {
                                break;
                            }

                        }else {
                            break;
                        }
                    }

                } else {

                    break;

                }
            }else {

                break;
            }
        }
        //------------------------------------
        for (int t = 1; t <= 12; t++) {
            if ( y +t <12) {
                if (da[x][y] == da[x ][y +t]) {
                    da[x ][y +t] = 0;
                    for (int aa=1;aa<=12;aa++){
                        if (x-aa>=0){
                            if (da[x][y]==da[x-aa][y+t]){
                            da[x-aa][y+t]=0;

                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }

                } else {
                    break;
                }
            }else {
                break;
            }
        }
        //-----------------------------------------------
        for (int tt = 1; tt <= 12; tt++) {
            if ( y +tt <12) {
                if (da[x][y] == da[x ][y +tt]) {
                    da[x ][y +tt] = 0;
                    for (int bb=1;bb<=6;bb++){
                        if (x+bb<12){
                            if (da[x][y]==da[x+bb][y+tt]){
                                da[x+bb][y+tt]=0;

                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }

                } else {
                    break;
                }
            }else {
                break;
            }
        }
        //---------------------------------
        for (int n = 1; n <= 12; n++) {
            if ( x - n >= 0) {
                if (da[x][y] == da[x-n][y ]) {
                    da[x-n][y ] = 0;
                    for(int ee=1;ee<=12;ee++){
                        if (y+ee<12){
                            if (da[x-n][y+ee]==da[x][y]){
                                da[x-n][y+ee]=0;
                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }

                } else {
                    break;
                }
            }else {
                break;
            }
        }
        //-------------------------------------------
        for (int nn = 1; nn <= 12; nn++) {
            if ( x - nn >= 0) {
                if (da[x][y] == da[x-nn][y ]) {
                    da[x-nn][y ] = 0;
                    for(int uu=1;uu<=12;uu++){
                        if (y-uu>=0){
                            if (da[x-nn][y-uu]==da[x][y]){
                                da[x-nn][y-uu]=0;
                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }

                } else {
                    break;
                }
            }else {
                break;
            }
        }
        //--------------------------------------------
        for (int m= 1; m <= 12; m++) {
            if ( x + m <6) {
                if (da[x][y] == da[x+m][y ]) {
                    da[x+m][y ] = 0;
                    for (int ff=1;ff<=12;ff++){
                        if(y-ff>=0){
                            if (da[x][y]==da[x+m][y-ff]){
                                da[x+m][y-ff]=0;
                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }

                } else {
                    break;
                }
            }else {
                break;
            }
        }
        //-------------------------------------
        for (int mm= 1; mm <= 12; mm++) {
            if ( x + mm <6) {
                if (da[x][y] == da[x+mm][y ]) {
                    da[x+mm][y ] = 0;
                    for (int vv=1;vv<=12;vv++){
                        if(y+vv<12){
                            if (da[x][y]==da[x+mm][y+vv]){
                                da[x+mm][y+vv]=0;
                            }else {
                                break;
                            }
                        }else {
                            break;
                        }
                    }

                } else {
                    break;
                }
            }else {
                break;
            }
        }
        //-------------------------------------
        da[x][y]=0;
        int yy=0;
        for (int o=0;o<6;o++){
            for (int p=0;p<12;p++){
               a[yy] =da[o][p];
                yy++;
            }

        }

      for (int b=0;b<=71;b++){
          System.out.print(a[b]);
          if (b>1&&(b+1)%12==0){
              System.out.println();
          }
      }


    }
}
