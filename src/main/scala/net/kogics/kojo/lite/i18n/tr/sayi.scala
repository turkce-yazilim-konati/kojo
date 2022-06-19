/*
 * Copyright (C) 2022
 *   Bulent Basaran <ben@scala.org> https://github.com/bulent2k2
 *   Lalit Pant <pant.lalit@gmail.com>
 *
 * The contents of this file are subject to the GNU General Public License
 * Version 3 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.gnu.org/copyleft/gpl.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 */
package net.kogics.kojo.lite.i18n.tr

// also see: aralik.scala
trait IntMethodsInTurkish {
  implicit class SayıYöntemleri(a: Sayı) {
    def |-(b: Sayı): Range = a until b
    def |-|(b: Sayı): Range = a to b
    def yazıya = a.toString
  }

}

trait DoubleMethodsInTurkish {
  implicit class KesirYöntemleri(a: Kesir) {
    def yazıya = a.toString
    def sayıya = a.toInt
  }

}
