/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Utils;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author João Felipe
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public VPrincipal() {
        initComponents();
        //Comandos para colocar icone
        URL url = this.getClass().getResource("/Imagens/icone.ico");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);

        chooser.setApproveButtonText("Baixar");
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String extension = Utils.getExtension(f);
                if (extension != null) {
                    if (extension.equals(Utils.xls)) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return false;
            }

            @Override
            public String getDescription() {
                return "Arquivos Microsoft Excel 97-2003 (*.xls)";
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        chooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArea = new javax.swing.JMenu();
        jMenuItemAdicionarArea = new javax.swing.JMenuItem();
        jMenuItemRemoverArea = new javax.swing.JMenuItem();
        jMenuItemModificarArea = new javax.swing.JMenuItem();
        jMenuItemConsultarArea = new javax.swing.JMenuItem();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemImportar = new javax.swing.JMenuItem();
        jMenuItemExportar = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuTemperatura = new javax.swing.JMenu();
        jMenuItemInserirTemperatura = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuGerarRelatorioGrafico = new javax.swing.JMenu();
        jMenuItemAcumulado = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemTutorial = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();

        jMenuItem10.setText("jMenuItem10");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sleep Tree");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bg_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        jMenuArea.setText("Área");

        jMenuItemAdicionarArea.setText("Adicionar Área");
        jMenuItemAdicionarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdicionarAreaActionPerformed(evt);
            }
        });
        jMenuArea.add(jMenuItemAdicionarArea);

        jMenuItemRemoverArea.setText("Remover Área");
        jMenuItemRemoverArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRemoverAreaActionPerformed(evt);
            }
        });
        jMenuArea.add(jMenuItemRemoverArea);

        jMenuItemModificarArea.setText("Modificar Área");
        jMenuItemModificarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarAreaActionPerformed(evt);
            }
        });
        jMenuArea.add(jMenuItemModificarArea);

        jMenuItemConsultarArea.setText("Consultar Área");
        jMenuItemConsultarArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarAreaActionPerformed(evt);
            }
        });
        jMenuArea.add(jMenuItemConsultarArea);

        jMenuBar1.add(jMenuArea);

        jMenuArquivo.setText("Arquivo");

        jMenuItemImportar.setText("Importar");
        jMenuItemImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImportarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemImportar);

        jMenuItemExportar.setText("Exportar");
        jMenuItemExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExportarActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemExportar);
        jMenuArquivo.add(jSeparator2);

        jMenuItem2.setText("Baixar Modelo");
        jMenuItem2.setToolTipText("Baixar modelo padrão de tabela Excel.");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItem2);

        jMenuBar1.add(jMenuArquivo);

        jMenuTemperatura.setText("Temperaturas");

        jMenuItemInserirTemperatura.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemInserirTemperatura.setText("Inserir Temperatura");
        jMenuItemInserirTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInserirTemperaturaActionPerformed(evt);
            }
        });
        jMenuTemperatura.add(jMenuItemInserirTemperatura);

        jMenuBar1.add(jMenuTemperatura);

        jMenuRelatorio.setText("Relatórios");

        jMenuGerarRelatorioGrafico.setText("Gerar Gráfico");

        jMenuItemAcumulado.setText("Acumulado");
        jMenuItemAcumulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcumuladoActionPerformed(evt);
            }
        });
        jMenuGerarRelatorioGrafico.add(jMenuItemAcumulado);

        jMenuRelatorio.add(jMenuGerarRelatorioGrafico);

        jMenu1.setText("Gerar Relatório");

        jMenuItem3.setText("Acumulado");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Quinzenal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuRelatorio.add(jMenu1);

        jMenuBar1.add(jMenuRelatorio);

        jMenuAjuda.setText("Ajuda");

        jMenuItemTutorial.setText("Tutorial");
        jMenuItemTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTutorialActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemTutorial);

        jMenuItemSobre.setText("Sobre");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar1.add(jMenuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImportarActionPerformed
        VImportar imp = new VImportar();
        imp.setVisible(true);
    }//GEN-LAST:event_jMenuItemImportarActionPerformed

    private void jMenuItemInserirTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInserirTemperaturaActionPerformed
        VTemperatura temperatura = new VTemperatura();
        temperatura.setVisible(true);
    }//GEN-LAST:event_jMenuItemInserirTemperaturaActionPerformed

    private void jMenuItemAdicionarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdicionarAreaActionPerformed
        VAdicionarArea adicionarArea = new VAdicionarArea();
        //adicionarArea.getjTextNome().setBorder(new LineBorder(Color.GRAY));
        //VTemperatura temp = new VTemperatura();

        adicionarArea.setVisible(true);
    }//GEN-LAST:event_jMenuItemAdicionarAreaActionPerformed

    private void jMenuItemRemoverAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRemoverAreaActionPerformed
        VRemoverArea removerArea = new VRemoverArea();
        removerArea.setVisible(true);
    }//GEN-LAST:event_jMenuItemRemoverAreaActionPerformed

    private void jMenuItemModificarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarAreaActionPerformed
        VModificarArea modificar = new VModificarArea();
        modificar.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarAreaActionPerformed

    private void jMenuItemConsultarAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarAreaActionPerformed
        VConsultarArea consultar = new VConsultarArea();
        consultar.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarAreaActionPerformed

    private void jMenuItemAcumuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcumuladoActionPerformed
        // TODO add your handling code here:
        VRelatorioGrafico grafico = new VRelatorioGrafico();
        grafico.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcumuladoActionPerformed

    
    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
        VSobre sobre = new VSobre();
        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jMenuItemExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExportarActionPerformed
        VExportar exp = new VExportar();
        exp.setVisible(true);
    }//GEN-LAST:event_jMenuItemExportarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int resultado = chooser.showOpenDialog(this);
        System.out.println("Resultado: " + resultado);
        if (resultado == JFileChooser.APPROVE_OPTION) {

            try {
                String endereco = chooser.getSelectedFile().toString();
                System.out.println("Arquivos Selecionado: " + endereco);
                
                WritableWorkbook workbook;
                workbook = Workbook.createWorkbook(new File(endereco + ".xls"));
                WritableSheet sheet = workbook.createSheet("Modelo", 0);
                
                // Create a cell format for Arial 10 point font
                WritableFont arial10font = new WritableFont(WritableFont.ARIAL, 12, WritableFont.BOLD);
                WritableCellFormat arial12format = new WritableCellFormat(arial10font);
                Label label = new Label(0, 0, "Data", arial12format);
                sheet.addCell(label);
                Label label2 = new Label(1, 0, "Temperatura 21h Ant. (°C)", arial12format);
                sheet.addCell(label2);
                Label label3 = new Label(2, 0, "Temperatura Mínima  (°C)", arial12format);
                sheet.addCell(label3);
                Label label4 = new Label(3, 0, "Temperatura Máxima  (°C)", arial12format);
                sheet.addCell(label4);
                Label label5 = new Label(4, 0, "Temperatura 21h  (°C)", arial12format);
                sheet.addCell(label5);
                Label label6 = new Label (0, 1, "2017-04-01");
                sheet.addCell(label6);
                
                workbook.write();
                workbook.close();
                JOptionPane.showMessageDialog(null, "Arquivo salvo com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

            } catch (IOException ex) {
                Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (WriteException ex) {
                Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here
         VGerarRelatorio rel = new VGerarRelatorio();
        rel.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VGerarRelatorioQ rel = new VGerarRelatorioQ();
        rel.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTutorialActionPerformed
        // TODO add your handling code here:
        System.out.println("");
        try{
            Desktop.getDesktop().open(new File("./Tutorial.pdf"));
        }catch(Exception e){
            System.out.println("erro: " + e);
        }
    }//GEN-LAST:event_jMenuItemTutorialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser chooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArea;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuGerarRelatorioGrafico;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItemAcumulado;
    private javax.swing.JMenuItem jMenuItemAdicionarArea;
    private javax.swing.JMenuItem jMenuItemConsultarArea;
    private javax.swing.JMenuItem jMenuItemExportar;
    private javax.swing.JMenuItem jMenuItemImportar;
    private javax.swing.JMenuItem jMenuItemInserirTemperatura;
    private javax.swing.JMenuItem jMenuItemModificarArea;
    private javax.swing.JMenuItem jMenuItemRemoverArea;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTutorial;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuTemperatura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
