# itsforher

```
- ETracker
  |-- frame (JFrame)
  |-- table (JTable)
  |-- model (DefaultTableModel)
  |-- dateField (JTextField)
  |-- descField (JTextField)
  |-- amountField (JTextField)
  |-- initialize()
      |-- frame (JFrame)
          |-- contentPane (JPanel, BorderLayout)
              |-- scrollPane (JScrollPane)
                  |-- table (JTable)
              |-- panel (JPanel, BorderLayout.NORTH)
                  |-- dateField (JTextField)
                  |-- descField (JTextField)
                  |-- amountField (JTextField)
                  |-- addButton (JButton)
                      |-- ActionListener
                          |-- actionPerformed()
                              |-- date, desc, amount (String, String, double)
                              |-- model.addRow()
                              |-- Clear text fields
  |-- main(String[] args)
      |-- EventQueue.invokeLater()
          |-- ETracker window = new ETracker()
          |-- window.frame.setVisible(true)
```
