-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: localhost    Database: bd-sistema-gestion-hotelera
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `dni` int(15) DEFAULT NULL,
  `idDireccion` int(11) NOT NULL,
  `idContacto` int(11) NOT NULL,
  `idLogin` int(11) NOT NULL,
  `idRecibo` int(11) NOT NULL,
  PRIMARY KEY (`idCliente`,`idDireccion`,`idContacto`,`idLogin`),
  KEY `fk_Cliente_Direccion1_idx` (`idDireccion`),
  KEY `fk_Cliente_Contacto1_idx` (`idContacto`),
  KEY `fk_Cliente_Login1_idx` (`idLogin`),
  KEY `fk_Cliente_Recibo1_idx` (`idRecibo`),
  CONSTRAINT `fk_Cliente_Contacto1` FOREIGN KEY (`idContacto`) REFERENCES `contacto` (`idContacto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_Direccion1` FOREIGN KEY (`idDireccion`) REFERENCES `direccion` (`idDireccion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_Login1` FOREIGN KEY (`idLogin`) REFERENCES `login` (`idLogin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Cliente_Recibo1` FOREIGN KEY (`idRecibo`) REFERENCES `recibo` (`idRecibo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contacto` (
  `idContacto` int(11) NOT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idContacto`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'42222222','1125279011','elhotelmaslindo@hotmail.com');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion` (
  `idDireccion` int(11) NOT NULL,
  `calle` varchar(80) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `codigoPostal` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDireccion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
INSERT INTO `direccion` VALUES (1,'Calle Falsa',123,'1855');
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleado` (
  `legajo` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `dni` int(15) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `idContacto` int(11) NOT NULL,
  `idLogin` int(11) NOT NULL,
  `idTipoEmpleado` int(11) NOT NULL,
  PRIMARY KEY (`legajo`,`idContacto`,`idLogin`,`idTipoEmpleado`),
  KEY `fk_Empleado_Contacto1_idx` (`idContacto`),
  KEY `fk_Empleado_Login1_idx` (`idLogin`),
  KEY `fk_Empleado_TipoEmpleado1_idx` (`idTipoEmpleado`),
  CONSTRAINT `fk_Empleado_Contacto1` FOREIGN KEY (`idContacto`) REFERENCES `contacto` (`idContacto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empleado_Login1` FOREIGN KEY (`idLogin`) REFERENCES `login` (`idLogin`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Empleado_TipoEmpleado1` FOREIGN KEY (`idTipoEmpleado`) REFERENCES `tipoempleado` (`idTipoEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadia`
--

DROP TABLE IF EXISTS `estadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadia` (
  `idEstadia` int(11) NOT NULL,
  `fechaIngreso` date DEFAULT NULL,
  `fechaSalida` date DEFAULT NULL,
  `idCliente` int(11) NOT NULL,
  `idEstadoEstadia` int(11) NOT NULL,
  `idTicket` int(11) DEFAULT NULL,
  PRIMARY KEY (`idEstadia`,`idCliente`,`idEstadoEstadia`),
  KEY `fk_Estadia_Cliente1_idx` (`idCliente`),
  KEY `fk_Estadia_TipoEstado1_idx` (`idEstadoEstadia`),
  CONSTRAINT `fk_Estadia_Cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadia`
--

LOCK TABLES `estadia` WRITE;
/*!40000 ALTER TABLE `estadia` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadoestadia`
--

DROP TABLE IF EXISTS `estadoestadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadoestadia` (
  `idEstadoEstadia` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEstadoEstadia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadoestadia`
--

LOCK TABLES `estadoestadia` WRITE;
/*!40000 ALTER TABLE `estadoestadia` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadoestadia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL,
  `fechaEmision` date DEFAULT NULL,
  `legajo` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idItemFactura` int(11) NOT NULL,
  PRIMARY KEY (`idFactura`,`legajo`),
  KEY `fk_Factura_Empleado1_idx` (`legajo`),
  KEY `fk_Factura_Cliente1_idx` (`idCliente`),
  KEY `fk_Factura_Item1_idx` (`idItemFactura`),
  CONSTRAINT `fk_Factura_Cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Item1` FOREIGN KEY (`idItemFactura`) REFERENCES `itemfactura` (`idItemFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formadepago`
--

DROP TABLE IF EXISTS `formadepago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `formadepago` (
  `idFormaDePago` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idFormaDePago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formadepago`
--

LOCK TABLES `formadepago` WRITE;
/*!40000 ALTER TABLE `formadepago` DISABLE KEYS */;
/*!40000 ALTER TABLE `formadepago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `capacidadMax` int(11) DEFAULT NULL,
  `disponibilidad` tinyint(1) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`idHabitacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacionestadia`
--

DROP TABLE IF EXISTS `habitacionestadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitacionestadia` (
  `idHabitacion` int(11) NOT NULL,
  `idEstadia` int(11) NOT NULL,
  PRIMARY KEY (`idHabitacion`,`idEstadia`),
  KEY `fk_Habitacion_has_Estadia_Estadia1_idx` (`idEstadia`),
  KEY `fk_Habitacion_has_Estadia_Habitacion1_idx` (`idHabitacion`),
  CONSTRAINT `fk_Habitacion_has_Estadia_Estadia1` FOREIGN KEY (`idEstadia`) REFERENCES `estadia` (`idEstadia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Habitacion_has_Estadia_Habitacion1` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacionestadia`
--

LOCK TABLES `habitacionestadia` WRITE;
/*!40000 ALTER TABLE `habitacionestadia` DISABLE KEYS */;
/*!40000 ALTER TABLE `habitacionestadia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hotel` (
  `cuil` varchar(13) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `categoria` int(11) DEFAULT NULL,
  `checkin` varchar(5) DEFAULT NULL,
  `chekout` varchar(5) DEFAULT NULL,
  `idDireccion` int(11) NOT NULL,
  `idContacto` int(11) NOT NULL,
  PRIMARY KEY (`cuil`,`idDireccion`,`idContacto`),
  KEY `fk_Hotel_Direccion2_idx` (`idDireccion`),
  KEY `fk_Hotel_Contacto1_idx` (`idContacto`),
  CONSTRAINT `fk_Hotel_Contacto1` FOREIGN KEY (`idContacto`) REFERENCES `contacto` (`idContacto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Hotel_Direccion2` FOREIGN KEY (`idDireccion`) REFERENCES `direccion` (`idDireccion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel`
--

LOCK TABLES `hotel` WRITE;
/*!40000 ALTER TABLE `hotel` DISABLE KEYS */;
INSERT INTO `hotel` VALUES ('30-51752011-6','Hotel \"Las Marias\"',5,'9:00','21:00',1,1);
/*!40000 ALTER TABLE `hotel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itemfactura`
--

DROP TABLE IF EXISTS `itemfactura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itemfactura` (
  `idItemFactura` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precioUnitario` double DEFAULT NULL,
  PRIMARY KEY (`idItemFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itemfactura`
--

LOCK TABLES `itemfactura` WRITE;
/*!40000 ALTER TABLE `itemfactura` DISABLE KEYS */;
/*!40000 ALTER TABLE `itemfactura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `idLogin` int(11) NOT NULL,
  `usuario` varchar(100) DEFAULT NULL,
  `clave` varchar(45) DEFAULT NULL,
  `idPrivilegio` int(11) NOT NULL,
  PRIMARY KEY (`idLogin`,`idPrivilegio`),
  KEY `fk_Login_Privilegio1_idx` (`idPrivilegio`),
  CONSTRAINT `fk_Login_Privilegio1` FOREIGN KEY (`idPrivilegio`) REFERENCES `privilegio` (`idPrivilegio`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privilegio`
--

DROP TABLE IF EXISTS `privilegio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `privilegio` (
  `idPrivilegio` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPrivilegio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privilegio`
--

LOCK TABLES `privilegio` WRITE;
/*!40000 ALTER TABLE `privilegio` DISABLE KEYS */;
/*!40000 ALTER TABLE `privilegio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recibo`
--

DROP TABLE IF EXISTS `recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recibo` (
  `idRecibo` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `idFormaDePago` int(11) NOT NULL,
  PRIMARY KEY (`idRecibo`),
  KEY `fk_Recibo_FormaDePago1_idx` (`idFormaDePago`),
  CONSTRAINT `fk_Recibo_FormaDePago1` FOREIGN KEY (`idFormaDePago`) REFERENCES `formadepago` (`idFormaDePago`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recibo`
--

LOCK TABLES `recibo` WRITE;
/*!40000 ALTER TABLE `recibo` DISABLE KEYS */;
/*!40000 ALTER TABLE `recibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportelimpieza`
--

DROP TABLE IF EXISTS `reportelimpieza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reportelimpieza` (
  `idReporteLimpieza` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `desperfeto` varchar(45) DEFAULT NULL,
  `legajo` int(11) NOT NULL,
  PRIMARY KEY (`idReporteLimpieza`),
  KEY `fk_ReporteLimpieza_Empleado1_idx` (`legajo`),
  CONSTRAINT `fk_ReporteLimpieza_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportelimpieza`
--

LOCK TABLES `reportelimpieza` WRITE;
/*!40000 ALTER TABLE `reportelimpieza` DISABLE KEYS */;
/*!40000 ALTER TABLE `reportelimpieza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportemantenimiento`
--

DROP TABLE IF EXISTS `reportemantenimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reportemantenimiento` (
  `idReporte` int(11) NOT NULL,
  `reparacion` varchar(45) DEFAULT NULL,
  `fOrigen` date DEFAULT NULL,
  `fResolucion` date DEFAULT NULL,
  `desperfecto` varchar(80) DEFAULT NULL,
  `terminado` tinyint(1) DEFAULT NULL,
  `legajo` int(11) NOT NULL,
  PRIMARY KEY (`idReporte`),
  KEY `fk_ReporteMantenimiento_Empleado1_idx` (`legajo`),
  CONSTRAINT `fk_ReporteMantenimiento_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportemantenimiento`
--

LOCK TABLES `reportemantenimiento` WRITE;
/*!40000 ALTER TABLE `reportemantenimiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `reportemantenimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicio` (
  `idServicio` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`idServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket` (
  `idTicket` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `idServicio` int(11) NOT NULL,
  `idFactura` int(11) NOT NULL,
  `idEstadia` int(11) NOT NULL,
  `legajo` int(11) NOT NULL,
  `idTipoTicket` int(11) NOT NULL,
  PRIMARY KEY (`idTicket`,`legajo`),
  KEY `fk_Ticket_Servicio1_idx` (`idServicio`),
  KEY `fk_Ticket_Factura1_idx` (`idFactura`),
  KEY `fk_Ticket_Estadia1_idx` (`idEstadia`),
  KEY `fk_Ticket_Empleado1_idx` (`legajo`),
  KEY `fk_Ticket_TipoTicket1_idx` (`idTipoTicket`),
  CONSTRAINT `fk_Ticket_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ticket_Estadia1` FOREIGN KEY (`idEstadia`) REFERENCES `estadia` (`idEstadia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ticket_Factura1` FOREIGN KEY (`idFactura`) REFERENCES `factura` (`idFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ticket_Servicio1` FOREIGN KEY (`idServicio`) REFERENCES `servicio` (`idServicio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Ticket_TipoTicket1` FOREIGN KEY (`idTipoTicket`) REFERENCES `tipoticket` (`idTipoTicket`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoempleado`
--

DROP TABLE IF EXISTS `tipoempleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoempleado` (
  `idTipoEmpleado` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipoEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoempleado`
--

LOCK TABLES `tipoempleado` WRITE;
/*!40000 ALTER TABLE `tipoempleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoempleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipohabitacion`
--

DROP TABLE IF EXISTS `tipohabitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipohabitacion` (
  `idTipoHabitacion` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `idHabitacion` int(11) NOT NULL,
  PRIMARY KEY (`idTipoHabitacion`),
  KEY `fk_TipoHabitacion_Habitacion1_idx` (`idHabitacion`),
  CONSTRAINT `fk_TipoHabitacion_Habitacion1` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipohabitacion`
--

LOCK TABLES `tipohabitacion` WRITE;
/*!40000 ALTER TABLE `tipohabitacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipohabitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoticket`
--

DROP TABLE IF EXISTS `tipoticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoticket` (
  `idTipoTicket` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipoTicket`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoticket`
--

LOCK TABLES `tipoticket` WRITE;
/*!40000 ALTER TABLE `tipoticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-01 13:02:04
