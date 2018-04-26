package ch.puzzle.marinabackend.employee;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import ch.puzzle.marinabackend.AbstractEntity;

@Entity
@Table(name = "current_configuration")
public class CurrentConfiguration extends AbstractEntity{
    @OneToOne(mappedBy = "currentConfiguration")
    @JsonBackReference
    private Employee employee;
    
    @Column(name = "amount_chf")
    private BigDecimal amountChf;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "wallet_type")
    private WalletType walletType;
    
    @Column(name = "current_address")
    private String currentAddress;
    
    @Column(name = "bip32_node")
    private String bip32Node;
    
    @Column(name = "current_address_index")
    private Long currentAddressIndex;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public BigDecimal getAmountChf() {
        return amountChf;
    }

    public void setAmountChf(BigDecimal amountChf) {
        this.amountChf = amountChf;
    }

    public WalletType getWalletType() {
        return walletType;
    }

    public void setWalletType(WalletType walletType) {
        this.walletType = walletType;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getBip32Node() {
        return bip32Node;
    }

    public void setBip32Node(String bip32Node) {
        this.bip32Node = bip32Node;
    }

    public Long getCurrentAddressIndex() {
        return currentAddressIndex;
    }

    public void setCurrentAddressIndex(Long currentAddressIndex) {
        this.currentAddressIndex = currentAddressIndex;
    }
}