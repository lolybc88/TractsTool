<?xml version="1.0" encoding="UTF-8"?>
<pro:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:pro="http://pro/1.0">
  <creates object="Project_0" type="Project"/>
  <creates object="Folder_1" type="Folder"/>
  <creates object="Folder_2" type="Folder"/>
  <creates object="File_3" type="File"/>
  <creates object="File_4" type="File"/>
  <sets object="Folder_1" attribute="name" value="test3"/>
  <sets object="Folder_1" attribute="absoluteName" value="teste"/>
  <sets object="Folder_2" attribute="name" value="TechReport"/>
  <sets object="Folder_2" attribute="absoluteName" value="test"/>
  <sets object="File_3" attribute="name" value="a"/>
  <sets object="File_3" attribute="absoluteName" value="a"/>
  <sets object="File_3" attribute="extension" value="a"/>
  <sets object="File_4" attribute="name" value="b"/>
  <sets object="File_4" attribute="absoluteName" value="s"/>
  <sets object="File_4" attribute="extension" value="x"/>
  <inserts obj1="Project_0" obj2="Folder_1" rel="root_Project_Entity"/>
  <inserts obj1="Folder_1" obj2="Folder_2" rel="content_container_Folder_Entity"/>
  <inserts obj1="Folder_1" obj2="File_4" rel="content_container_Folder_Entity"/>
  <inserts obj1="Folder_2" obj2="File_3" rel="content_container_Folder_Entity"/>
</pro:Model>
