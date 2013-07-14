/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ama;

/**
 *
 * @author kerem
 */
public class Assistant {

    private String label, purpose;
    
    private final String SEPARATOR = "*&----------------------------------------------------------------------";
    private final String ENTER = "\r\n";
    
    public Assistant(String Label, String Purpose)
    {
        label = Label;
        purpose = Purpose;
    }
    
    public String insert() {
        
        String ret = "";
        ret += getOpenTag("INSERT");
        ret += getPurpose();
        ret += "* code here" + ENTER;
        ret += getCloseTag("INSERT");
        
        return ret;
    }
    
    public String replace(String Code) {
        String ret = "";
        ret += getOpenTag("REPLACE");
        String p = getPurpose();
        ret += p;
        if (p.length() <= 0) ret += SEPARATOR + ENTER;   
        ret += getCommentedCode(Code) + ENTER;
        ret += SEPARATOR + ENTER;
        ret += Code + ENTER;
        ret += getCloseTag("REPLACE");
        
        return ret;
    }
    
    public String delete(String Code) {
        String ret = "";
        ret += getOpenTag("DELETE");
        String p = getPurpose();
        ret += p;
        if (p.length() <= 0) ret += SEPARATOR + ENTER;   
        ret += getCommentedCode(Code) + ENTER;
        ret += SEPARATOR + ENTER;
        ret += getCloseTag("DELETE");
        
        return ret;
    }
    
    private String getOpenTag(String Operation) {
        return "*{      " + Operation + "              " + label + ENTER;
    }
    
    private String getCloseTag(String Operation) {
        return "*}      " + Operation + "              " + label;
    }
    
    private String getPurpose() {
        if (purpose == null || purpose.length() <= 0) return "";
        String ret = SEPARATOR + ENTER;
        ret += "*& " + purpose + ENTER;
        ret += SEPARATOR + ENTER;
        return ret;
    }
    
    private String getCommentedCode(String Code) {
        return "*" + Code.replaceAll("\n", "\n* ");
    }
    
}
