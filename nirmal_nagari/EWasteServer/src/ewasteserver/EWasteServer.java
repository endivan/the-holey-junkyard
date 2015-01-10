package ewasteserver;

import java.util.Calendar;

/**
 * Main server class to accept client connections and show request listing.
 *
 * {@code EWasteServer} creates instances of {@link EWasteServerThread} to handle client connections
 * and displays a window showing all pending requests and the next collection date.
 *
 * @author shardul
 */
public class EWasteServer extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private static int PORT = 30303;
    // next collection date
    static String next;
    // milliseconds per day
    private long day = 1000*60*60*24;

    /**
     * Creates new form EWasteServer
     */
    public EWasteServer() {
        initComponents();
        // schedule date-checking everyday to get date of next Monday
        (new java.util.Timer("collection_date")).schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                Calendar date = Calendar.getInstance();
                // purge list every Monday
                if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
                    data.setText(null);
                }
                // get next Monday's date
                while (date.get(Calendar.DAY_OF_WEEK) != Calendar.MONDAY) {
                    date.add(Calendar.DATE, 1);
                }
                // format date and display
                java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
                next = sdf.format(date.getTime());
                collDate.setText("Next Collection Date: " + next);
            }
        }, new java.util.Date(), day);
    }

    /*
     * Update requests listing.
     */
    public synchronized static void updateData(String addr, String desc, String item) {
        data.append(addr);
        data.append("\n");
        data.append(item);
        data.append(": ");
        data.append(desc);
        data.append("\n\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        collDate = new javax.swing.JLabel();
        requests = new javax.swing.JLabel();
        dataPane = new javax.swing.JScrollPane();
        data = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EWasteServer");

        collDate.setText("Next Collection Date: yyyy-mm-dd");

        requests.setText("Requests:");

        data.setEditable(false);
        data.setColumns(20);
        data.setLineWrap(true);
        data.setRows(8);
        data.setWrapStyleWord(true);
        dataPane.setViewportView(data);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collDate)
                            .addComponent(requests))
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(collDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requests)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Main executing method.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EWasteServer().setVisible(true);
            }
        });

        // spawn new thread to spawn more threads on incoming requests
        (new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try (java.net.ServerSocket sock = new java.net.ServerSocket(PORT)) {
                        (new ewasteserver.EWasteServerThread(sock.accept())).start();
                    } catch (java.io.IOException ex) {
                        System.err.println("Caught IOException: " + ex.getLocalizedMessage());
                        System.exit(-2);
                    }
                }
            }
        })).start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel collDate;
    private static javax.swing.JTextArea data;
    private javax.swing.JScrollPane dataPane;
    private javax.swing.JLabel requests;
    // End of variables declaration//GEN-END:variables
}