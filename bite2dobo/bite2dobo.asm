<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="bite2dobo"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchbibtex2docbook():V"/>
		<constant value="A.__matchproc2book():V"/>
		<constant value="A.__matchinproc2article():V"/>
		<constant value="A.__matchperson2author():V"/>
		<constant value="__exec__"/>
		<constant value="bibtex2docbook"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applybibtex2docbook(NTransientLink;):V"/>
		<constant value="proc2book"/>
		<constant value="A.__applyproc2book(NTransientLink;):V"/>
		<constant value="inproc2article"/>
		<constant value="A.__applyinproc2article(NTransientLink;):V"/>
		<constant value="person2author"/>
		<constant value="A.__applyperson2author(NTransientLink;):V"/>
		<constant value="getAllProc"/>
		<constant value="Proc"/>
		<constant value="MM"/>
		<constant value="J.allInstances():J"/>
		<constant value="7:49-7:56"/>
		<constant value="7:49-7:72"/>
		<constant value="__matchbibtex2docbook"/>
		<constant value="BibTeXFile"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="b"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="d"/>
		<constant value="DocBook"/>
		<constant value="MM1"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="14:3-14:18"/>
		<constant value="__applybibtex2docbook"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="link"/>
		<constant value="__matchproc2book"/>
		<constant value="proc"/>
		<constant value="book"/>
		<constant value="Book"/>
		<constant value="21:3-25:4"/>
		<constant value="__applyproc2book"/>
		<constant value="title"/>
		<constant value="Editorship"/>
		<constant value="author"/>
		<constant value="file"/>
		<constant value="docBook"/>
		<constant value="22:13-22:17"/>
		<constant value="22:13-22:23"/>
		<constant value="22:4-22:23"/>
		<constant value="23:14-23:18"/>
		<constant value="23:14-23:29"/>
		<constant value="23:4-23:29"/>
		<constant value="24:15-24:19"/>
		<constant value="24:15-24:24"/>
		<constant value="24:4-24:24"/>
		<constant value="__matchinproc2article"/>
		<constant value="InProc"/>
		<constant value="ip"/>
		<constant value="Article"/>
		<constant value="32:3-36:4"/>
		<constant value="__applyinproc2article"/>
		<constant value="Authorship"/>
		<constant value="J.getAllProc():J"/>
		<constant value="4"/>
		<constant value="booktitle"/>
		<constant value="J.=(J):J"/>
		<constant value="B.not():B"/>
		<constant value="39"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="CJ.asSequence():QJ"/>
		<constant value="QJ.first():J"/>
		<constant value="33:13-33:15"/>
		<constant value="33:13-33:21"/>
		<constant value="33:4-33:21"/>
		<constant value="34:14-34:16"/>
		<constant value="34:14-34:27"/>
		<constant value="34:4-34:27"/>
		<constant value="35:12-35:22"/>
		<constant value="35:12-35:35"/>
		<constant value="35:45-35:46"/>
		<constant value="35:45-35:52"/>
		<constant value="35:55-35:57"/>
		<constant value="35:55-35:67"/>
		<constant value="35:45-35:67"/>
		<constant value="35:12-35:68"/>
		<constant value="35:4-35:68"/>
		<constant value="p"/>
		<constant value="__matchperson2author"/>
		<constant value="Person"/>
		<constant value="a"/>
		<constant value="Author"/>
		<constant value="43:3-45:4"/>
		<constant value="__applyperson2author"/>
		<constant value="44:12-44:13"/>
		<constant value="44:12-44:18"/>
		<constant value="44:4-44:18"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<call arg="57"/>
		</code>
		<linenumbertable>
			<lne id="58" begin="0" end="2"/>
			<lne id="59" begin="0" end="3"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="60">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="61"/>
			<push arg="56"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="66"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="68"/>
			<push arg="69"/>
			<push arg="70"/>
			<new/>
			<pcall arg="71"/>
			<pusht/>
			<pcall arg="72"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="73" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="66" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="74">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="75"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="76"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="68"/>
			<call arg="77"/>
			<store arg="78"/>
			<load arg="78"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="73" begin="8" end="9"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="68" begin="7" end="9"/>
			<lve slot="2" name="66" begin="3" end="9"/>
			<lve slot="0" name="17" begin="0" end="9"/>
			<lve slot="1" name="79" begin="0" end="9"/>
		</localvariabletable>
	</operation>
	<operation name="80">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="81"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="82"/>
			<push arg="83"/>
			<push arg="70"/>
			<new/>
			<pcall arg="71"/>
			<pusht/>
			<pcall arg="72"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="84" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="81" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="85">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="75"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="81"/>
			<call arg="76"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="82"/>
			<call arg="77"/>
			<store arg="78"/>
			<load arg="78"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="86"/>
			<call arg="30"/>
			<set arg="86"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="87"/>
			<call arg="30"/>
			<set arg="88"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="89"/>
			<call arg="30"/>
			<set arg="90"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="91" begin="11" end="11"/>
			<lne id="92" begin="11" end="12"/>
			<lne id="93" begin="9" end="14"/>
			<lne id="94" begin="17" end="17"/>
			<lne id="95" begin="17" end="18"/>
			<lne id="96" begin="15" end="20"/>
			<lne id="97" begin="23" end="23"/>
			<lne id="98" begin="23" end="24"/>
			<lne id="99" begin="21" end="26"/>
			<lne id="84" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="82" begin="7" end="27"/>
			<lve slot="2" name="81" begin="3" end="27"/>
			<lve slot="0" name="17" begin="0" end="27"/>
			<lve slot="1" name="79" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="100">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="101"/>
			<push arg="56"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="102"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="66"/>
			<push arg="103"/>
			<push arg="70"/>
			<new/>
			<pcall arg="71"/>
			<pusht/>
			<pcall arg="72"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="104" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="102" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="105">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="75"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="102"/>
			<call arg="76"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="66"/>
			<call arg="77"/>
			<store arg="78"/>
			<load arg="78"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="86"/>
			<call arg="30"/>
			<set arg="86"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="106"/>
			<call arg="30"/>
			<set arg="88"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<getasm/>
			<call arg="107"/>
			<iterate/>
			<store arg="108"/>
			<load arg="108"/>
			<get arg="86"/>
			<load arg="29"/>
			<get arg="109"/>
			<call arg="110"/>
			<call arg="111"/>
			<if arg="112"/>
			<load arg="108"/>
			<call arg="113"/>
			<enditerate/>
			<call arg="114"/>
			<call arg="115"/>
			<call arg="30"/>
			<set arg="82"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="116" begin="11" end="11"/>
			<lne id="117" begin="11" end="12"/>
			<lne id="118" begin="9" end="14"/>
			<lne id="119" begin="17" end="17"/>
			<lne id="120" begin="17" end="18"/>
			<lne id="121" begin="15" end="20"/>
			<lne id="122" begin="26" end="26"/>
			<lne id="123" begin="26" end="27"/>
			<lne id="124" begin="30" end="30"/>
			<lne id="125" begin="30" end="31"/>
			<lne id="126" begin="32" end="32"/>
			<lne id="127" begin="32" end="33"/>
			<lne id="128" begin="30" end="34"/>
			<lne id="129" begin="23" end="41"/>
			<lne id="130" begin="21" end="43"/>
			<lne id="104" begin="8" end="44"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="131" begin="29" end="38"/>
			<lve slot="3" name="66" begin="7" end="44"/>
			<lve slot="2" name="102" begin="3" end="44"/>
			<lve slot="0" name="17" begin="0" end="44"/>
			<lve slot="1" name="79" begin="0" end="44"/>
		</localvariabletable>
	</operation>
	<operation name="132">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="133"/>
			<push arg="56"/>
			<findme/>
			<push arg="62"/>
			<call arg="63"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="64"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="65"/>
			<dup/>
			<push arg="131"/>
			<load arg="19"/>
			<pcall arg="67"/>
			<dup/>
			<push arg="134"/>
			<push arg="135"/>
			<push arg="70"/>
			<new/>
			<pcall arg="71"/>
			<pusht/>
			<pcall arg="72"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="136" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="131" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="137">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="75"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="131"/>
			<call arg="76"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="134"/>
			<call arg="77"/>
			<store arg="78"/>
			<load arg="78"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="138" begin="11" end="11"/>
			<lne id="139" begin="11" end="12"/>
			<lne id="140" begin="9" end="14"/>
			<lne id="136" begin="8" end="15"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="134" begin="7" end="15"/>
			<lve slot="2" name="131" begin="3" end="15"/>
			<lve slot="0" name="17" begin="0" end="15"/>
			<lve slot="1" name="79" begin="0" end="15"/>
		</localvariabletable>
	</operation>
</asm>
