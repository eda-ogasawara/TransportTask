package application;

public class FogelMAX {
    
    Integer rows, columns;
    Integer[][] money;
    Integer[][] m;
    Integer[][] basic;//массив опорного плана
    Integer Z = 0;//ЦФ
    Integer balan1 = 0, balan2 = 0;
    
    public FogelMAX(Integer row, Integer column, Integer balan1, Integer balan2, Integer[][] money){
        this.m = money;
        this.rows = row;
        this.columns = column;
        this.balan1 = balan1;
        this.balan2 = balan2;
    }

    public void setMoneyNM() {
        basic = new Integer[rows][columns];
    }
    
    Integer FillBasicPlan(Integer[][] mass, Integer[][] mass2, Integer row, Integer col){
        int i = 0, j = 0, k = 0, max1, max2;
        Integer Z = 0;
        while (k < 7){
            for (i = 0; i < col+1; i++)
                mass[row][i] = 0;
            for (i = 0; i < row+1; i++)
                mass[i][col] = 0;
            i = 0;
            while (i < row){
                max1 = 0;
                max2 = 0;
                j = 0;
                if (mass[i][0]==0){ 
                    i++;
                    continue;
                }
                boolean ok = false;
                while(j < col){
                    if (mass[0][j] != 0 && ok == false){
                        max1 = mass[i][j];
                        ok = true;
                    } 
                    else if (mass[0][j] != 0 && ok == true){
                        max2 = mass[i][j];
                        j++;
                        break;
                    }
                    j++;
                }
                if (max1 > max2){
                    max1 += max2;
                    max2 = max1 - max2;
                    max1 -= max2;
                }
                while(j < col){
                    if (mass[0][j] != 0){ 
                        if (mass[i][j] > max1 && mass[i][j] < max2)
                            max1 = mass[i][j];
                        else if (mass[i][j] <= max2) {
                            max1 = max2;
                            max2 = mass[i][j];
                        }
                    }
                j++;
                }
                mass[i][j] = Math.abs(max2 - max1);
                i++;
            }

            j = 0;
            while (j < col){
                max1 = 0;
                max2 = 0;
                i = 0;
                if (mass[0][j] == 0){ 
                    j++;
                    continue;
                }
                boolean ok = false;
                while(i < row){
                    if (mass[i][0] != 0 && ok == false){
                        max1 = mass[i][j];
                        ok = true;
                    } 
                    else if (mass[i][0] != 0 && ok == true){
                        max2 = mass[i][j];
                        i++;
                        break;
                    }
                    i++;
                }

                if (max1 > max2){
                    max1 += max2;
                    max2 = max1 - max2;
                    max1 -= max2;
                }

                while(i < row){
                    if (mass[i][0] != 0){
                        if (mass[i][j] > max1 && mass[i][j] < max2)
                            max1 = mass[i][j];
                        else if (mass[i][j] <= max2) {
                            max1 = max2;
                            max2 = mass[i][j];
                        }
                    }
                    i++;
                }
                mass[i][j] = Math.abs(max2 - max1);
                j++;
            }
    //----------------------------------------------------------------------
            int I = row;  
            int J = col; 
            int max = 0;
            j = 0;
            while (j < col){
                if (mass[0][j] != 0)
                if (mass[row][j] > max){ 
                    max = mass[row][j];
                    I = row;
                    J = j;
                }
                j++;
            }

            i = 0;
            while (i < row){
                if (mass[i][0] != 0)
                    if (mass[i][col] > max){ 
                        max = mass[i][col];
                        I = i;
                        J = col;
                    }
                i++;
            }
//-----------------------------------------------------------------------
            int I1 = 0;
            int J1 = 0;
            int maxx = 888888;
            if (I == row){ 
                i = 0;
                while (i < row){
                    if (mass[i][0] != 0)
                        if (mass[i][J] > maxx){
                            maxx = mass[i][J];
                            I1 = i;
                            J1 = J;
                        }
                    i++;
                }
            } else
            if (J == col){
                j = 0;
                while (j < col){ 
                    if (mass[0][j] != 0)
                    if (mass[I][j] > maxx){
                        maxx = mass[I][j];
                        I1 = I;
                        J1 = j;
                    }
                    j++;
                }
            }
    //----------------------------------------------------------------------------------------------
            if (mass[0][J1] <= mass[I1][0]){
                mass2[I1][J1] = mass[I1][J1] * mass[0][J1];
                mass[I1][0] -= mass[0][J1];
                mass[0][J1] = 0;
            } 
            else if (mass[0][J1] > mass[I1][0]){
                mass2[I1][J1] = mass[I1][J1] * mass[I1][0];
                mass[0][J1] -= mass[I1][0];
                mass[I1][0] = 0;
            }
            Z += mass2[I1][J1];
        k++;
        }
        return Z;
    }
    
    public void cycle(){
        setMoneyNM();
        Z = FillBasicPlan(m, basic, rows, columns);
    }

    public Integer[][] getM() {
        return m;
    }

    public Integer getZ() {
        return Z;
    }
    
}
