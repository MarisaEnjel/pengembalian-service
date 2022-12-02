/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marisaenjel.pengembalianservice.Vo;

import com.marisaenjel.pengembalianservice.Entity.Pengembalian;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author acer
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVo {
    private Pengembalian pengembalian;
    private Peminjaman peminjaman; 
}
