ABAP Modification Assistant
===

This tool provides you the functionality of the ABAP Modification Assistant outside of the SAP development screen (SE38).

All ABAP developers need to modify the code of other developers sometimes. It is polite and appropriate to add comments to your modifications. For example; you don't delete a part of the code directly, it's preferable to comment the code out and add a remark about the reason of that. The same applies to insertions and modifications.

If you are modifying a SAP-Standard program (meaning: doing repairs), this functionality is provided to you automatically through the ABAP Modification Assistant. However, if you are modifying a custom developed program of another developer, you have to do it yourself.

This tool provides you the functionality of the ABAP Modification Assistant outside of the SAP development screen (SE38). Here is how to use it… First, fill the "Label" and "Purpose" fields. Then;

-) If you are going to make an insertion, hit "Insert" and paste the code into SE38.
-) If you are going to make a modification, paste the original code into the program, hit "Replace", and paste the generated code back into SE38 (replacing the original code).
-) If you are going to delete a code, paste the original code into the program, hit "Delete", and paste the generated code back into SE38 (replacing the original code).

If you are using the new ABAP editor, the standard code template options of SAPGui may provide a similar functionality. This tool would mostly be useful for people using the old editor or SAPGui for Java.

Mac users can start the application by double-clicking on "ama.jar". Windows users have to double-click "ama.bat".

This application was developed with Java using Netbeans on a Mac.
