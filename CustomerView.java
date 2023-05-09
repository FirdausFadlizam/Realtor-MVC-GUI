import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class CustomerView extends GUI {
    public JPanel searchHouse(){



        JPanel customerPanel = new JPanel();


        customerPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton realtorButton = new JButton("Realtor");
        realtorButton.addActionListener(new ActionListener() {
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

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1;
        customerPanel.add(realtorButton, gbc);
        gbc.gridy++;
        JLabel searchLabel = new JLabel ("Search");
        customerPanel.add(searchLabel,gbc);
        gbc.gridy++;
        customerPanel.add(priceLabel,gbc);
        gbc.gridx++;
        customerPanel.add(priceTextField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        customerPanel.add(zipLabel,gbc);
        gbc.gridx++;
        customerPanel.add(zipTextField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        customerPanel.add(cityLabel,gbc);
        gbc.gridx++;
        customerPanel.add(cityTextField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        customerPanel.add(yearBuiltLabel,gbc);
        gbc.gridx++;
        customerPanel.add(yearBuiltTextField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        customerPanel.add(propertyLabel,gbc);
        gbc.gridx++;
        customerPanel.add(propertyTypeTextField, gbc);
        gbc.gridy++;
        gbc.gridx = 0;
        customerPanel.add(numOfBedroomsLabel,gbc);
        gbc.gridx++;
        customerPanel.add(numOfBedroomsTextField, gbc);
        gbc.gridx = 0;
        gbc.gridy++;
        JButton searchButton = new JButton("Search");
        customerPanel.add(searchButton, gbc);
        searchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                customerPanel.updateUI();
                houseController.createNewHouse();
                if(priceTextField.getText().isEmpty()== false)
                houseController.setHousePrice(Double.parseDouble(priceTextField.getText()));
                houseController.setHouseCity(cityTextField.getText());
                if(zipTextField.getText().isEmpty()== false)
                houseController.setHouseZip(Integer.parseInt(zipTextField.getText()));
                if(yearBuiltTextField.getText().isEmpty()== false)
                houseController.setHouseYearBuilt(Integer.parseInt(yearBuiltTextField.getText()));
                houseController.setHouseProperty(propertyTypeTextField.getText());
                if(numOfBedroomsTextField.getText().isEmpty()== false)
                houseController.setHouseBedrooms(Integer.parseInt(numOfBedroomsTextField.getText()));

                List<House> houseResult = houseController.searchResult();
                int j = 1;
                for(House i : houseResult){

                    JLabel separator = new JLabel ("---------------");
                    JLabel houseLabel = new JLabel (  j+".)" + " " + i.getPropertyType() + " House ");
                    j++;
                    JButton houseButton = new JButton("Click");
                    houseButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent arg0) {
                            houseController.checkDetailedView(i.getIndex());
                           cl.show(container, "3");
                        }
                    });
                    gbc.gridy++;
                    customerPanel.add(separator,gbc);
                    gbc.gridy++;
                    customerPanel.add(houseLabel,gbc);
                    gbc.gridy++;
                    customerPanel.add(houseButton,gbc);
                    gbc.gridy++;

                }

            }
        });

        return customerPanel;
    }


}
