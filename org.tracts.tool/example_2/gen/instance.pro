<?xml version="1.0" encoding="UTF-8"?>
<pro:Model xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:pro="http://pro/1.0">
  <creates object="EClass0_0" type="EClass0"/>
  <creates object="EClass1_1" type="EClass1"/>
  <creates object="EClass2_2" type="EClass2"/>
  <creates object="EClass2_3" type="EClass2"/>
  <creates object="EClass2_4" type="EClass2"/>
  <sets object="EClass0_0" attribute="attr0" value="Set{abc,def,ghi}"/>
  <sets object="EClass0_0" attribute="attr1" value="Bag{true,false}"/>
  <sets object="EClass1_1" attribute="EAttribute0" value="Sequence{#a,#b}"/>
  <sets object="EClass2_2" attribute="EAttribute0" value="false"/>
  <sets object="EClass2_2" attribute="EAttribute1" value="Sequence{}"/>
  <sets object="EClass2_3" attribute="EAttribute0" value="false"/>
  <sets object="EClass2_3" attribute="EAttribute1" value="Sequence{10,11,12}"/>
  <sets object="EClass2_4" attribute="EAttribute0" value="false"/>
  <sets object="EClass2_4" attribute="EAttribute1" value="Sequence{1,2,3}"/>
  <inserts obj1="EClass0_0" obj2="EClass1_1" rel="EReference0_EClass0_EClass1"/>
  <inserts obj1="EClass0_0" obj2="EClass2_2" rel="EReference1_EClass0_EClass2"/>
  <inserts obj1="EClass0_0" obj2="EClass2_3" rel="EReference1_EClass0_EClass2"/>
  <inserts obj1="EClass0_0" obj2="EClass2_4" rel="EReference1_EClass0_EClass2"/>
</pro:Model>
