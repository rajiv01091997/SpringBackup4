package com.globallogic.Entity;

import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
    @Id
   private int id;
    private String email;
    private String phone;
    private String name;
    private String address;
}
