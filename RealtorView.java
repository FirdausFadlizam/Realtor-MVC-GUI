import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RealtorView extends GUI{
    static int index = 0;
public JPanel getRealtorAddView(){

    JPanel realtorPanel = new JPanel();
    realtorPanel.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    JButton customerButton = new JButton("Customer");
    customerButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            cl.show(container, "2");
        }
    });

    JLabel priceLabel = new JLabel("Price: ");
    JTextField priceTextField = new JTextField(15);
    JLabel addressLabel = new JLabel("Address: ");
    JTextField addressTextField = new JTextField(15);
    JLabel zipLabel = new JLabel("Zip: ");
    JTextField zipTextField = new JTextField(15);
    JLabel cityLabel = new JLabel("City: ");
    JTextField cityTextField = new JTextField(15);
    JLabel yearBuiltLabel = new JLabel("Year Built: ");
    JTextField yearBuiltTextField = new JTextField(15);
    JLabel propertyLabel = new JLabel("Property Type: ");
    JTextField propertyTypeTextField = new JTextField(15);
    JLabel numOfBedroomsLabel = new JLabel("Number of Bedrooms: ");
    JTextField numOfBedroomsTextField = new JTextField(15);

    realtorPanel.add(customerButton);

    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.weighty = 1;
    gbc.gridy++;
    gbc.gridx = 0;
    realtorPanel.add(priceLabel,gbc);
    gbc.gridx++;
    realtorPanel.add(priceTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    realtorPanel.add(addressLabel,gbc);
    gbc.gridx++;
    realtorPanel.add(addressTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    realtorPanel.add(zipLabel,gbc);
    gbc.gridx++;
    realtorPanel.add(zipTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    realtorPanel.add(cityLabel,gbc);
    gbc.gridx++;
    realtorPanel.add(cityTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    realtorPanel.add(yearBuiltLabel,gbc);
    gbc.gridx++;
    realtorPanel.add(yearBuiltTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    realtorPanel.add(propertyLabel,gbc);
    gbc.gridx++;
    realtorPanel.add(propertyTypeTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    realtorPanel.add(numOfBedroomsLabel,gbc);
    gbc.gridx++;
    realtorPanel.add(numOfBedroomsTextField, gbc);
    gbc.gridx = 0;
    gbc.gridy++;
    JButton addButton = new JButton("Add");
    realtorPanel.add(addButton, gbc);
    addButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            houseController.createNewHouse();
            houseController.setHousePrice(Double.parseDouble(priceTextField.getText()));
            houseController.setHouseAddress(addressTextField.getText());
            houseController.setHouseCity(cityTextField.getText());
            houseController.setHouseZip(Integer.parseInt(zipTextField.getText()));
            houseController.setHouseYearBuilt(Integer.parseInt(yearBuiltTextField.getText()));
            houseController.setHouseProperty(propertyTypeTextField.getText());
            houseController.setHouseBedrooms(Integer.parseInt(numOfBedroomsTextField.getText()));
            houseController.addHouse();

            List<House> houseResult = houseController.getHouseList();
            int j = 1;
            for(House i : houseResult){

                JLabel separator = new JLabel ("---------------");
                JLabel houseLabel = new JLabel (  j+".)" + " " + i.getPropertyType() + " House ");
                j++;
                JButton houseButton = new JButton("Edit");
                houseButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        updateHouseInfo(i.getIndex());
                        cl.show(container, "4");
                    }
                });
                gbc.gridy++;
                realtorPanel.add(separator,gbc);
                gbc.gridy++;
                realtorPanel.add(houseLabel,gbc);
                gbc.gridy++;
                realtorPanel.add(houseButton,gbc);
                gbc.gridy++;

            }
            realtorPanel.updateUI();
        }
    });

    return realtorPanel;
}

public void updateHouseInfo(int index) {
    JPanel updatePanel = new JPanel();
    updatePanel.setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    JButton returnButton = new JButton("Return");
    returnButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            cl.show(container, "1");
        }
    });

    JLabel priceLabel = new JLabel("Price: ");
    JTextField priceTextField = new JTextField(15);
    JLabel addressLabel = new JLabel("Address: ");
    JTextField addressTextField = new JTextField(15);
    JLabel zipLabel = new JLabel("Zip: ");
    JTextField zipTextField = new JTextField(15);
    JLabel cityLabel = new JLabel("City: ");
    JTextField cityTextField = new JTextField(15);
    JLabel yearBuiltLabel = new JLabel("Year Built: ");
    JTextField yearBuiltTextField = new JTextField(15);
    JLabel propertyLabel = new JLabel("Property Type: ");
    JTextField propertyTypeTextField = new JTextField(15);
    JLabel numOfBedroomsLabel = new JLabel("Number of Bedrooms: ");
    JTextField numOfBedroomsTextField = new JTextField(15);

    updatePanel.add(returnButton);

    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.weighty = 1;
    gbc.gridy++;
    gbc.gridx = 0;
    updatePanel.add(priceLabel, gbc);
    gbc.gridx++;
    updatePanel.add(priceTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    updatePanel.add(addressLabel, gbc);
    gbc.gridx++;
    updatePanel.add(addressTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    updatePanel.add(zipLabel, gbc);
    gbc.gridx++;
    updatePanel.add(zipTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    updatePanel.add(cityLabel, gbc);
    gbc.gridx++;
    updatePanel.add(cityTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    updatePanel.add(yearBuiltLabel, gbc);
    gbc.gridx++;
    updatePanel.add(yearBuiltTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    updatePanel.add(propertyLabel, gbc);
    gbc.gridx++;
    updatePanel.add(propertyTypeTextField, gbc);
    gbc.gridy++;
    gbc.gridx = 0;
    updatePanel.add(numOfBedroomsLabel, gbc);
    gbc.gridx++;
    updatePanel.add(numOfBedroomsTextField, gbc);
    gbc.gridx = 0;
    gbc.gridy++;
    JButton updateButton = new JButton("Update");
    updateButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
            houseController.createNewHouse();
            houseController.setHousePrice(Double.parseDouble(priceTextField.getText()));
            houseController.setHouseAddress(addressTextField.getText());
            houseController.setHouseCity(cityTextField.getText());
            houseController.setHouseZip(Integer.parseInt(zipTextField.getText()));
            houseController.setHouseYearBuilt(Integer.parseInt(yearBuiltTextField.getText()));
            houseController.setHouseProperty(propertyTypeTextField.getText());
            houseController.setHouseBedrooms(Integer.parseInt(numOfBedroomsTextField.getText()));
            houseController.updateHouseInfo(index);

        }

    });
    updatePanel.add(updateButton, gbc);
    container.add(updatePanel, "4");
}
}

