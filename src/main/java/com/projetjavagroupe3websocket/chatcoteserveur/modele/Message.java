/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetjavagroupe3websocket.chatcoteserveur.modele;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
/**
 *
 * @author DELL Precision
 */
public class Message {
     private String senderName;
    private String receiverName;
    private String message;
    private String date;
    private Status status;
}
