package org.hyacinthbots.allium.extensions

import com.kotlindiscord.kord.extensions.extensions.Extension
import com.kotlindiscord.kord.extensions.extensions.publicSlashCommand
import com.kotlindiscord.kord.extensions.types.respond
import dev.kord.rest.builder.message.create.embed
import kotlinx.coroutines.flow.count
import org.hyacinthbots.allium.utils.*

/**
 * About command.
 * Written in pure boredom in school.
 * @author NotJansel
 * @since 0.1.3
 */
class About : Extension() {
    override val name = "about"
    override suspend fun setup() {
        publicSlashCommand {
            name = "about"
            description = "what is this bot?"
            action {
                val kord = this@About.kord
                respond {
                    embed {
                        title = "Allium"
                        field {
                            name = "General Information"
                            inline = false
                            value = """
                                Hello! I am Allium, a Minecraft modding focused bot.
                            """.trimIndent()
                        }
                        field {
                            name = "Birthday (initial date of idea)"
                            value = "September 6th, 2022"
                        }
                        field {
                            name = "Developers"
                            value = "Jansel, StonkDragon (mental help)"
                        }
                        field {
                            name = "Contributors"
                            value = """[Jansel](https://github.com/NotJansel)
                                    |[StonkDragon](https://github.com/StonkDragon)
                                    |[triphora](https://github.com/triphora)
                                    |[NoComment](https://github.com/NoComment1105)
                                    """.trimMargin()
                        }
                        field {
                            name = "Important Links"
                            value = "[Source Code](https://github.com/HyacinthBots/Allium)\n" +
                                    "[Terms of Service](https://github.com/HyacinthBots/.github/blob/main/terms-of-service.md)\n" +
                                    "[Privacy Policy](https://github.com/HyacinthBots/Allium/tree/root/docs/privacy-policy.md)\n" +
                                    "[Link to add me to your Server](https://discord.com/api/oauth2/authorize?client_id=1013045351852298280&permissions=347136&scope=bot%20applications.commands)\n"
                        }
                        field {
                            name = "Guilds"
                            value = kord.guilds.count().toString()
                        }
                        field {
                            name = "Build"
                            value = BUILD
                        }
                        field {
                            name = "Next update?"
                            value = "In 3-5 business days."
                        }
                    }
                }
            }
        }
    }
}
