package com.example.graphqljavacorrected.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class UserInformation {
        @Id
        @GeneratedValue
        private Long id;

        private String userCity;
        private String userLiveAddress;
        private String userPhoneNumber;

}
