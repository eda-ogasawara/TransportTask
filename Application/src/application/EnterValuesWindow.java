package application;

import java.util.Objects;
import javax.swing.table.DefaultTableModel;

public class EnterValuesWindow extends javax.swing.JFrame {
    
    public EnterValuesWindow(Integer row, Integer column) {
        this.row = row;
        this.column = column;
        setTitle("Транспортная задача");
        setLocation(380, 200);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 300));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Введите значения спроса и предложений");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText(" Спрос");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Предложение");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Заполните таблицу издержек");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Метод нахождения опорного плана");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Целевая функция");

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jComboBox1.setMaximumRowCount(4);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Северо-Западного угла", "Аппроксимации Фогеля", "Минимального элемента", "Максимального элемента " }));

        jComboBox2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jComboBox2.setMaximumRowCount(2);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Минимальные затраты", "Максимальные затраты" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Решить");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable1.setModel(model1 = new javax.swing.table.DefaultTableModel(
            new Integer [column], 1) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setRowHeight(20);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(jTable1);

        jTable2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable2.setModel(model2 = new javax.swing.table.DefaultTableModel(
            new Object [row], 1) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setRequestFocusEnabled(false);
        jTable2.setRowHeight(20);
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable2);

        jTable3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTable3.setModel(model3 = new javax.swing.table.DefaultTableModel(
            new Object[column], row) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setAutoscrolls(false);
        jTable3.setRowHeight(20);
        jTable3.getTableHeader().setResizingAllowed(false);
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        masPredloj = new Integer[row];
        for(int i = 0; i < jTable2.getColumnCount(); i++){
            masPredloj[i] = (Integer) model2.getValueAt(0, i);
        }
        masSpros = new Integer[column];
        for(int i = 0; i < jTable1.getColumnCount(); i++){
            masSpros[i] = (Integer) model1.getValueAt(0, i);
        }
        money = new Integer[row + 1][column + 1];
        m = new Integer[row + 1][column + 1];
        for(int i = 0; i < jTable3.getRowCount(); i++){
            for(int j = 0; j < jTable3.getColumnCount(); j++){
                money[i][j] = (Integer) model3.getValueAt(i, j);
                m[i][j] = (Integer) model3.getValueAt(i, j);
            }
            money[i][column] =  masPredloj[i];
            money[row][i] = masSpros[i];
            m[i][column] =  masPredloj[i];
            m[row][i] = masSpros[i];
        }
        for(int i = 0; i < row; i++){
            balan1 += masPredloj[i];
        }
        for(int i = 0; i < column; i++){
            balan2 += masSpros[i];
        }
        if(Objects.equals(balan1, balan2)){
            conditionSelection();
        }
        else{
            new NotBalans();
        }
    }
    
    public void conditionSelection(){
        if(jComboBox1.getSelectedItem() == jComboBox1.getItemAt(0)){
            if(jComboBox2.getSelectedItem() == jComboBox2.getItemAt(0)){
                NCMin();
            }
            else if(jComboBox2.getSelectedItem() == jComboBox2.getItemAt(1)){
                NCMax();
            }
            new Solution(row, column, balan1, balan2, money, masPredloj, masSpros, xMN, Z).setTitle("Метод Северо-Западного угла");
        }
        if(jComboBox1.getSelectedItem() == jComboBox1.getItemAt(1)){
            if(jComboBox2.getSelectedItem() == jComboBox2.getItemAt(0)){
                FogelMin();
            }
            else if(jComboBox2.getSelectedItem() == jComboBox2.getItemAt(1)){
                FogelMax();
            }
            new Solution(row, column, balan1, balan2, m, masPredloj, masSpros, xMN, Z).setTitle("Метод Аппроксимации Фогеля");
        }
        if(jComboBox1.getSelectedItem() == jComboBox1.getItemAt(2)){
            if(jComboBox2.getSelectedItem() == jComboBox2.getItemAt(0)){
                MinElement();
            }
            new Solution(row, column, balan1, balan2, m, masPredloj, masSpros, xMN, Z).setTitle("Метод Минимального элемента");
        }
        if(jComboBox1.getSelectedItem() == jComboBox1.getItemAt(3)){
            if(jComboBox2.getSelectedItem() == jComboBox2.getItemAt(1)){
                MaxElement();
            }
            new Solution(row, column, balan1, balan2, m, masPredloj, masSpros, xMN, Z).setTitle("Метод Максимального элемента");
        }
    }//GEN-LAST:event_jButton1MouseClicked
    
    void NCMin(){
        ncMin = new NorthwestCornerMIN(row, column, balan1, balan2, money);
        ncMin.cycle();
        this.xMN = ncMin.getxMN();
        this.Z = ncMin.getZ();
    }
    
    void NCMax(){
        ncMax = new NorthwestCornerMAX(row, column, balan1, balan2, money);
        ncMax.cycle();
        this.xMN = ncMax.getxMN();
        this.Z = ncMax.getZ();
    }
    
    void FogelMin(){
        fogelMin = new FogelMIN(row, column, balan1, balan2, money);
        fogelMin.cycle();
        this.xMN = fogelMin.getM();
        this.Z = fogelMin.getZ();
    }
    
    void FogelMax(){
        fogelMax = new FogelMAX(row, column, balan1, balan2, money);
        fogelMax.cycle();
        this.xMN = fogelMax.getM();
        this.Z = fogelMax.getZ();
    }
    
    void MinElement(){
        minElement = new MinElement(row, column, money);
        minElement.cycle();
        this.xMN = minElement.getxMN();
        this.Z = minElement.getZ();
    }
    
    void MaxElement(){
        maxElement = new MaxElement(row, column, money);
        maxElement.cycle();
        this.xMN = maxElement.getxMN();
        this.Z = maxElement.getZ();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    protected javax.swing.JComboBox<String> jComboBox1;
    protected javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables
    Integer row, column, Z;
    Integer balan1 = 0, balan2 = 0;
    DefaultTableModel model1, model2, model3;
    Integer[] masPredloj;
    Integer[] masSpros;
    Integer[][] money;
    Integer[][] xMN;
    Integer[][] m;
    NorthwestCornerMIN ncMin;
    NorthwestCornerMAX ncMax;
    FogelMIN fogelMin;
    FogelMAX fogelMax;
    MinElement minElement;
    MaxElement maxElement;
}
