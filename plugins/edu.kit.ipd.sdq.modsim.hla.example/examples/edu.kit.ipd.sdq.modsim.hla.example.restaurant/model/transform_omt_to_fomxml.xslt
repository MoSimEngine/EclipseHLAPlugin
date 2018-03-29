<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output indent="yes" />
	<xsl:strip-space elements="*" />


	<!-- Namespace von allen Elementen/Attributen entfernen. Der verwendete 
		Namespace stammt vom Meta-Modell -->
	<xsl:template match="*">
		<xsl:element name="{local-name(.)}">
			<xsl:apply-templates select="@* | node()" />
		</xsl:element>
	</xsl:template>
	<xsl:template match="@*">
		<xsl:attribute name="{local-name(.)}">
      <xsl:value-of select="." />
    </xsl:attribute>
	</xsl:template>


	<!-- Den richtigen Namespace von ObjectModel setzen -->
	<xsl:template match="/*">
		<xsl:element name="ns:{local-name()}"
			namespace="http://standards.ieee.org/IEEE1516-2010">
			<xsl:apply-templates select="node()|@*" />
		</xsl:element>
	</xsl:template>
</xsl:stylesheet>