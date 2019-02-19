package com.os.control.frames;

import com.os.control.file.Converter;
import com.os.control.file.DeSerialData;
import com.os.control.file.SerialData;
import com.os.control.file.IOFile;
import com.os.control.runnable.CustomRunnable;
import java.awt.Component;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        deSerial.deserial(pn_ParentContent);

        pn_ParentContent.setLayout(new BoxLayout(pn_ParentContent, BoxLayout.Y_AXIS));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_AddContent = new javax.swing.JButton();
        bt_hibernate = new javax.swing.JButton();
        bt_startAll = new javax.swing.JButton();
        bt_startQ = new javax.swing.JButton();
        bt_startMini = new javax.swing.JButton();
        bt_startOneSec = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_ParentContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        bt_AddContent.setText("Add");
        bt_AddContent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_AddContentActionPerformed(evt);
            }
        });

        bt_hibernate.setText("Hibernate");
        bt_hibernate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hibernateActionPerformed(evt);
            }
        });

        bt_startAll.setText("Start All");
        bt_startAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startAllActionPerformed(evt);
            }
        });

        bt_startQ.setText("Start Q FIFO");
        bt_startQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startQActionPerformed(evt);
            }
        });

        bt_startMini.setText("StartMiniProcess");
        bt_startMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startMiniActionPerformed(evt);
            }
        });

        bt_startOneSec.setText("start One sec");
        bt_startOneSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_startOneSecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_ParentContentLayout = new javax.swing.GroupLayout(pn_ParentContent);
        pn_ParentContent.setLayout(pn_ParentContentLayout);
        pn_ParentContentLayout.setHorizontalGroup(
            pn_ParentContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pn_ParentContentLayout.setVerticalGroup(
            pn_ParentContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pn_ParentContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_AddContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_startMini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_startQ, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_startOneSec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_startAll, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_hibernate)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_hibernate, bt_startAll, bt_startMini, bt_startOneSec, bt_startQ});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bt_AddContent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_hibernate)
                    .addComponent(bt_startMini)
                    .addComponent(bt_startQ)
                    .addComponent(bt_startAll, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_startOneSec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_AddContent, bt_hibernate, bt_startAll, bt_startMini, bt_startOneSec, bt_startQ});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_AddContentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_AddContentActionPerformed
        pn_ParentContent.add(new ContentPanel());
        pn_ParentContent.revalidate();
    }//GEN-LAST:event_bt_AddContentActionPerformed

    private void bt_hibernateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hibernateActionPerformed
        serial.serialData(pn_ParentContent);
        System.exit(0);
    }//GEN-LAST:event_bt_hibernateActionPerformed

    private void bt_startAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startAllActionPerformed

        Component[] components = pn_ParentContent.getComponents();

        for (Component component : components) {
            ContentPanel pn_childContent = (ContentPanel) component;
            JButton bt_Start = (JButton) pn_childContent.getComponent(2);//getButton
            bt_Start.doClick();
        }
    }//GEN-LAST:event_bt_startAllActionPerformed


    private void bt_startQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startQActionPerformed

        new Thread(() -> {

            Component[] components = pn_ParentContent.getComponents();
            for (Component component1 : components) {
                ContentPanel pn_childContent = (ContentPanel) component1;
                CustomRunnable runnable = pn_childContent.getRunnable();
                JButton bt_Start = (JButton) pn_childContent.getComponent(2);
                bt_Start.doClick();

                //wait loop
                while (runnable.getCurrent() - 1 != runnable.getTotal()) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }//GEN-LAST:event_bt_startQActionPerformed

    private void bt_startMiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startMiniActionPerformed

        new Thread(() -> {

            SortedMap map = new TreeMap();
            Component[] components = pn_ParentContent.getComponents();
            ContentPanel pn_childContent;
            CustomRunnable runnable;
            int key;
            int i = 0;
            JButton bt_start;

            for (Component component : components) {
                pn_childContent = (ContentPanel) component;
                runnable = pn_childContent.getRunnable();
                int current = runnable.getCurrent();
                int total = runnable.getTotal();
                key = total - current;
                map.put(key, pn_childContent);
            }

            Collection values = map.values();
            Iterator iterator = values.iterator();
            while (iterator.hasNext()) {
                ContentPanel pn_child = (ContentPanel) iterator.next();
                runnable = pn_child.getRunnable();
                bt_start = (JButton) pn_child.getComponent(2);
                bt_start.doClick();

                //wait loop
                while (true) {
                    if (runnable.getCurrent() == runnable.getTotal()) {
                        System.out.println("complete Bar ...");
                        break;
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }).start();
    }//GEN-LAST:event_bt_startMiniActionPerformed

    private void bt_startOneSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_startOneSecActionPerformed

        new Thread(() -> {

            LinkedList<ContentPanel> list = new LinkedList();
            Component[] components = pn_ParentContent.getComponents();
            ContentPanel pn_childContent;
            CustomRunnable runnable;
            JButton bt_start;
            int count = pn_ParentContent.getComponentCount();

            for (Component component : components) {
                pn_childContent = (ContentPanel) component;
                list.add(pn_childContent);
            }

            boolean finish = false;
            while (!finish) {
                for (ContentPanel list_pnChild : list) {

                    runnable = list_pnChild.getRunnable();
                    bt_start = (JButton) list_pnChild.getComponent(2);

                    if (runnable.getCurrent() - 1 != runnable.getTotal()) {
                        bt_start.doClick();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        runnable.stopRunning();
                    }
                }
                int i = 0;
                for (i = 0; i < count; i++) {
                    if (list.get(i).getRunnable().getCurrent() - 1 == list.get(i).getRunnable().getTotal()) {
                    } else {
                        break;
                    }
                }
                if (i == count) {
                    finish = true;
                }
            }
        }).start();
    }//GEN-LAST:event_bt_startOneSecActionPerformed

    SerialData serial = new SerialData() {
        LinkedList<String> list = new LinkedList();

        @Override
        public void addToList(ContentPanel content) {
            CustomRunnable runnable = content.getRunnable();
            int total = runnable.getTotal();
            int current = runnable.getCurrent();
            if (current > 0) {
                current--; //because is ubdated in runnable current++
            }
            list.add(current + "," + total);
        }

        @Override
        public void serialData(JPanel pn_ParentContent) {
            list = getComponentAsAlist(pn_ParentContent);
            IOFile.write(list, "test.txt");
        }
    };

    public LinkedList getComponentAsAlist(JPanel pn_ParentContent) {

        ContentPanel pn_childContent;
        LinkedList<String> list = new LinkedList();

        Component[] components = pn_ParentContent.getComponents();
        for (Component component : components) {
            pn_childContent = (ContentPanel) component;

            CustomRunnable runnable = pn_childContent.getRunnable();
            int total = runnable.getTotal();
            int current = runnable.getCurrent();
            if (current > 0) {
                current--; //because is ubdated in runnable current++
            }
            list.add(current + "," + total);
        }
        return list;
    }

    DeSerialData deSerial = (JPanel pn_ParentContent) -> {

        ContentPanel pn_childContent;
        LinkedList<String> list = IOFile.read("test.txt");

        for (String str : list) {
            pn_childContent = new ContentPanel();
            pn_ParentContent.add(pn_childContent);

            String[] split = str.split(",");
            int current = Converter.convertStringToInt(split[0]);
            int total = Converter.convertStringToInt(split[1]);
            pn_childContent.getRunnable().setTotal(total);
            pn_childContent.getRunnable().setCurrent(current--);
            pn_childContent.threadWork(); // show fill bar && (current++)
        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_AddContent;
    private javax.swing.JButton bt_hibernate;
    private javax.swing.JButton bt_startAll;
    private javax.swing.JButton bt_startMini;
    private javax.swing.JButton bt_startOneSec;
    private javax.swing.JButton bt_startQ;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pn_ParentContent;
    // End of variables declaration//GEN-END:variables

}
