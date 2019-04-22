/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analiselexer;

/**
 *
 * @author davin
 */
public enum Tag {
    
    // fim de arquivo
    EOF,
    
    //Operadores
    RELOP_LT,       // <
    RELOP_LE,       // <=
    RELOP_GT,       // >
    RELOP_GE,       // >=
    RELOP_EQ,       // ==
    RELOP_NE,       // !=
    RELOP_ASSIGN,   // =
    RELOP_SUM,      // +
    RELOP_MINUS,    // -
    RELOP_MULT,     // *
    RELOP_DIV,      // /
   
    //Simbolos
    SMB_OP,         // (
    SMB_CP,         // )
    SMB_SEMICOLON,  // ;
    SMB_ABCH, //{
    SMB_FCCH, //}
    SMB_VIR, //,
    //op.unitario
    OP_NAO, //!
    OP_NEGATIVO, //-
    OP_OR, //||
    OP_AND, //&&
    //identificador
    ID,
    
    //ConstString 
    ConstString,
    //constInteger
    ConstInteira,
    //constFloat
    contFloat,
    // palavra reservada
    KW;
}
