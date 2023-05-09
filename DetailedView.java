import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailedView extends GUI {

    public void printHouseDetails(double price, String address, int zip, String city, int year, String property, int beds) {

        JPanel housePanel = new JPanel();
        housePanel.setLayout(new GridBagLayout());
        JButton customerButton = new JButton("Customer");
        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                cl.show(container, "2");
            }
        });
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 1;
        housePanel.add(customerButton);
        gbc.gridy++;
        JLabel priceLabel = new JLabel("Price: " + price);
        housePanel.add(priceLabel, gbc);
        gbc.gridy++;
        JLabel addressLabel = new JLabel("Address: " + address);
        housePanel.add(addressLabel, gbc);

        gbc.gridy++;
        JLabel zipLabel = new JLabel("Zip: " + zip);
        housePanel.add(zipLabel, gbc);

        gbc.gridy++;
        JLabel cityLabel = new JLabel("City: " + city);
        housePanel.add(cityLabel, gbc);

        gbc.gridy++;
        JLabel yearBuiltLabel = new JLabel("Year Built: " + year);
        housePanel.add(yearBuiltLabel, gbc);

        gbc.gridy++;
        JLabel propertyLabel = new JLabel("Property Type: " + property);
        housePanel.add(propertyLabel, gbc);

        gbc.gridy++;
        JLabel numofBedroomsLabel = new JLabel("Number of Bedrooms: " + beds);
        housePanel.add(numofBedroomsLabel, gbc);

       container.add(housePanel, "3");

    }
}
